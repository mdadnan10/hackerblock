package sortingAlgo;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {20, 4, 10, 20, 10, 30, 40, 60};
        bubbleSort(arr);

        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }

        }


    }

}
