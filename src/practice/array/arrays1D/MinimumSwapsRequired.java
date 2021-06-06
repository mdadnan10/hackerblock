package practice.array.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwapsRequired {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        System.out.println(minimumSwaps(arr));

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int minimumSwaps(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != i + 1) {

                while (arr[i] != i + 1) {

                    int temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;

                    count++;
                }

            }

        }

        return count;
    }

}
