package arrays1d;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr1 = takeInput(n);
        int[] arr2 = takeInput(n);
        mergeTwoArrays(arr1, arr2);

    }

    public static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void mergeTwoArrays(int[] one, int[] two) {

        int m = one.length;
        int n = two.length;

        int[] merged = new int[m + n];
        int idx = 0;

        int i = 0;
        int j = 0;
        while (i < m && j < n) {

            if (one[i] > two[j]) {

                merged[idx] = two[j];
                idx++;
                j++;
            } else {
                merged[idx] = one[i];
                idx++;
                i++;
            }

        }

        while (i < m) {
            merged[idx] = one[i];
            idx++;
            i++;
        }

        while (j < n) {
            merged[idx] = two[j];
            idx++;
            j++;
        }

        System.out.println(merged[(merged.length - 1) / 2]);

    }

}
