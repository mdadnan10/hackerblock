package arrays1d;

import java.util.Scanner;

public class MinimumSwap {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        System.out.println(minimumSwaps(arr));

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    static int minimumSwaps(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != i + 1) {

                while (arr[i] != i + 1) {
                    int temp = 0;

                    temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                    count++;
                }
            }
        }
        return count;
    }

    public static void minimumSwap(int[] arr) {

        int count = 0;

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[j + 1] < arr[j]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;

                count++;
                j++;
            }
        }

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
        System.out.println(count);

    }
}
