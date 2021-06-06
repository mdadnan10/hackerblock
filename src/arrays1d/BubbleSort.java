package arrays1d;

import java.util.Scanner;

public class BubbleSort {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        sort(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean sorted = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j + 1] < arr[j]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    sorted = false;
                }

            }

            if (sorted) break;
        }

        for (int val : arr)
            System.out.print(val + " ");

    }

}
