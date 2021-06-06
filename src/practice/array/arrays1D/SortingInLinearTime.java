package practice.array.arrays1D;

import java.util.Scanner;

public class SortingInLinearTime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        sortingInLinearTime(arr);

        for (int val : arr)
            System.out.println(val);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void sort(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) mid++;

            else if (arr[mid] == 2) {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }

        }

    }

    public static void sortingInLinearTime(int[] arr) {

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
