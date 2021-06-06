package arrays1d;

import java.util.Scanner;

public class CalculateSum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        calculateSum(arr);

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

    public static void calculateSum(int[] arr) {

        int tc = sc.nextInt();

        for (int t = 1; t <= tc; t++) {

            int x = sc.nextInt();

            int[] newArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                int j = i - x;

                if (j >= 0) {
                    newArr[i] = arr[i] + arr[i - x];
                } else {
                    newArr[i] = arr[i] + arr[arr.length - x];
                }
            }

            if (x == 0) {
                int sum = 0;
                for (int i = 0; i < newArr.length; i++) {
                    newArr[i] += newArr[i];
                    sum += newArr[i];
                }

                long power = 1000000000 + 7;
                long ans = sum % power;

                System.out.println(ans);
            }
        }
    }
}