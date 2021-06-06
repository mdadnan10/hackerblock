package arrays1d;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        targetSumPairs(arr);

//        targetSum(arr);
//        targetSum2(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        return arr;
    }

    public static void targetSumPairs(int[] arr) {

        int target = sc.nextInt();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] + arr[j] > target)
                j--;
            else if (arr[i] + arr[j] < target)
                i++;
            else {
                System.out.println(arr[i] + " and " + arr[j]);
                i++;
                j--;
            }
        }
    }

    public static void targetSum(int[] arr) {

        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    if (i != j) {
                        System.out.println(arr[i] + " and " + arr[j]);
                    }
                }

            }

        }

    }

    public static void targetSum2(int[] arr) {

        int target = sc.nextInt();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] + arr[j] < target)
                i++;
            else if (arr[i] + arr[j] > target)
                j--;
            else {
                System.out.println(arr[i] + " and " + arr[j]);
                i++;
                j--;
            }

        }

    }
}