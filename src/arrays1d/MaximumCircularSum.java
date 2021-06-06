package arrays1d;

import java.util.Scanner;

public class MaximumCircularSum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int[] arr = takeInput();
            maxCircularSum(arr);
        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int kadane(int[] arr) {

        int sum = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            sum = Math.max(sum + arr[i], arr[i]);

            if (sum > max)
                max = sum;
        }

        return max;
    }

    public static void maxCircularSum(int[] arr) {

        int maxNonWrappingSum = kadane(arr);

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int ceWrapping = kadane(arr);
        int maxWrappingSum = totalSum + ceWrapping;

        int maxCircularSum = Math.max(maxNonWrappingSum, maxWrappingSum);

        System.out.println(maxCircularSum);
    }

}
