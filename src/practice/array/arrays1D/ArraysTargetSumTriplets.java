package practice.array.arrays1D;

import java.util.Scanner;

public class ArraysTargetSumTriplets {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = sort(takeInput());
        int target = sc.nextInt();
        targetSumTriplets(arr, target);

    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min_Ind = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min_Ind]) min_Ind = j;

            }

            int temp = arr[i];
            arr[i] = arr[min_Ind];
            arr[min_Ind] = temp;

        }

        return arr;
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void targetSumTriplets(int[] arr, int target) {


        for (int i = 0; i < arr.length; i++) {

            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {

                int sum = arr[i] + arr[start] + arr[end];

                if (sum < target)
                    start++;
                else if (sum > target)
                    end--;
                else {
                    System.out.println(arr[i] + ", " + arr[start] + " and " + arr[end]);
                    start++;
                    end--;
                }

            }

        }


    }

}
