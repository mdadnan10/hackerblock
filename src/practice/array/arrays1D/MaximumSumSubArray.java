package practice.array.arrays1D;

import java.util.Scanner;

public class MaximumSumSubArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();
            subArrayKadane(arr);

        }
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void subArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int currSum = 0;

                for (int k = i; k <= j; k++)
                    currSum += arr[k];

                if (currSum > sum)
                    sum = currSum;

            }
        }

        System.out.println(sum);
    }

    public static void subArrayKadane(int[] arr) {

        int sum = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            sum = Math.max(sum + arr[i], arr[i]);

            if (sum > max)
                max = sum;

        }

        System.out.println(max);
    }

}
