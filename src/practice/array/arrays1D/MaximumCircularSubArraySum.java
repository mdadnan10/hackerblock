package practice.array.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumCircularSubArraySum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int t = 1; t <= tc; t++) {
        int[] n = takeInput();
        }


    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int kadane(int[] arr) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : arr) {

            sum = Math.max(sum + i, i);
            max = Math.max(sum, max);

        }

        return max;
    }

    public static void maxSubArraySum(int[] arr) {

        int maxNonWrap = kadane(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = -arr[i];
        }

        int ceSum = kadane(arr);
        int maxWrapSum = sum + ceSum;

        int maxSubArraySum = Math.max(maxWrapSum, maxNonWrap);

        System.out.println(maxSubArraySum);
    }

}
