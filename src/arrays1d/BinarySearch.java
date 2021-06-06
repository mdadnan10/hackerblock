package arrays1d;

import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();

        System.out.println(search(arr));

    }

    public static int[] takeInput() {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int search(int[] arr) {
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target)
                high = mid - 1;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                return mid;
        }

        return -1;
    }
}
