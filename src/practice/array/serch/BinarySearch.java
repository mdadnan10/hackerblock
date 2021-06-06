package practice.array.serch;

import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int binarySearch(int[] arr, int target) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int mid = (i + j) / 2;

            if (arr[mid] < target)
                i = mid + 1;
            else if (arr[mid] > target)
                j = mid - 1;
            else return mid;

        }

        return -1;
    }
}
