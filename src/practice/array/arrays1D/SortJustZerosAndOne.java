package practice.array.arrays1D;

import java.util.Scanner;

public class SortJustZerosAndOne {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 1, 0, 2, 0};
        sort1(arr);

        for (int val : arr)
            System.out.print(val + " ");

    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void sort(int[] arr) {

        int i = 0;
        int j = 0;
        while (j < arr.length) {

            if (arr[j] != 0) j++;
            else {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            }

        }

    }

    public static void sort1(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) mid++;
            else if (arr[mid] == 2) {


                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                high--;
            }

        }


    }

}
