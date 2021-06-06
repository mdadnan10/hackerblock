package practice.array.arrays1D;

import java.util.Scanner;

public class MinimumSwap {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        minimumSwap(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void minimumSwap(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            count++;
        }

        System.out.println(count);

    }

}
