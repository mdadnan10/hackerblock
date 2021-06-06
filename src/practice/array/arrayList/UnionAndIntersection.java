package practice.array.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionAndIntersection {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 6, 8, 9, 10};
        int[] arr2 = {2, 3, 5, 7, 8, 9, 10, 10};
        union(arr1, arr2);
        System.out.println();
        intersection(arr1, arr2);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void union(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }

        }

        while (i < m) {
            union.add(arr1[i]);
            i++;
        }
        while (j < n) {
            union.add(arr2[j]);
            j++;
        }

        for (int si = 0; si < union.size() - 1; si++) {

            if (!union.get(si).equals(union.get(si + 1)))
                System.out.print(union.get(si) + " ");

        }

        System.out.print(union.get(union.size() - 1) + " ");

    }

    public static void intersection(int[] arr, int[] arr1) {

        ArrayList<Integer> interSection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr.length && j < arr1.length) {

            if (arr[i] < arr1[j]) i++;
            else if (arr[i] > arr1[j]) j++;
            else {
                interSection.add(arr[i]);
                i++;
                j++;
            }

        }

        for (int r = 0; r < interSection.size() - 1; r++) {

            if (!interSection.get(r).equals(interSection.get(r + 1))) {
                System.out.print(interSection.get(r) + " ");
            }

        }

        System.out.print(interSection.get(interSection.size() - 1) + " ");

    }

}
