package arrays1d;

import java.util.Scanner;

public class SelectionSort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        selectionSort(arr);
        display(arr);

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
            System.out.println(val);

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minInd = i;
            for (int j = i; j < n; j++) {

                if (arr[minInd] > arr[j]) minInd = j;

            }

            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;

        }

    }

}
