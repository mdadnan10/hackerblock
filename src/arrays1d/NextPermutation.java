package arrays1d;

import java.util.Scanner;

public class NextPermutation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        while (tc > 0) {
            int[] arr = takeInput();
            nextPermutation(arr);
            display(arr);
            tc--;
        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void display(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j)
            swap(arr, i++, j--);
    }

    public static void nextPermutation(int[] arr) {

        if (arr == null || arr.length <= 1) return;

        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }

        reverse(arr, i + 1, arr.length - 1);


    }

}
