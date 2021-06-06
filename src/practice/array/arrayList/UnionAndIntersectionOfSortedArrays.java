package practice.array.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnionAndIntersectionOfSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {7, 6, 5, 8, 1, 2};
        int[] arr2 = {1, 3, 2, 4, 1, 0, 2, 3, 0, 1};
//        union(arr1, arr2);
//        System.out.println();
//        interSection(arr1, arr2);
        doUnion(arr1, arr1.length, arr2, arr2.length);

    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void union(int[] arr1, int[] arr2) {

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                if (!union.contains(arr1[i]))
                    union.add(arr1[i]);

                i++;
            } else if (arr1[i] > arr2[j]) {

                if (!union.contains(arr2[j]))
                    union.add(arr2[j]);

                j++;
            } else {
                if (!union.contains(arr1[i]))
                    union.add(arr1[i]);

                i++;
                j++;
            }

        }

        while (i < arr1.length) {
            if (!union.contains(arr1[i]))
                union.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            if (!union.contains(arr2[j]))
                union.add(arr2[j]);
            j++;
        }

        for (Integer ans : union)
            System.out.print(ans + " ");
    }

    public static void interSection(int[] arr1, int[] arr2) {

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) i++;
            else if (arr1[i] > arr2[j]) j++;
            else {

                if (!intersection.contains(arr1[i]))
                    intersection.add(arr1[i]);

                i++;
                j++;
            }

        }

        for (Integer res : intersection)
            System.out.print(res + " ");

    }

    public static void doUnion(int[] a, int n, int[] b, int m) {

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {

            if (a[i] < b[j]) {

                if (!union.contains(a[i]))
                    union.add(a[i]);

                i++;
            } else if (a[i] > b[j]) {

                if (!union.contains(b[j]))
                    union.add(b[j]);

                j++;
            } else {

                if (!union.contains(a[i]))
                    union.add(a[i]);

                i++;
                j++;
            }

        }

        while (i < n) {

            if (!union.contains(a[i]))
                union.add(a[i]);

            i++;
        }
        while (j < m) {

            if (!union.contains(b[j]))
                union.add(b[j]);

            j++;
        }

        for (Integer ans : union)
            System.out.print(ans + " ");
    }

}
