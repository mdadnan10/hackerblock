package practice.array.arrays1D;

import java.util.Scanner;

public class TargetSumPairs {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = sort(takeInput());
        int target = sc.nextInt();
        targetSum(arr, target);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[minIdx] > arr[j]) minIdx = j;

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    public static void targetSum(int[] arr, int target) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum > target)
                j--;
            else if (sum < target)
                i++;
            else {
                System.out.println(arr[i] + " and " + arr[j]);
                i++;
                j--;
            }

        }

    }

}
