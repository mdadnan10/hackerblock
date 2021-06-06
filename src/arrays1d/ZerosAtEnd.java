package arrays1d;

import java.util.Scanner;

public class ZerosAtEnd {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        zerosAtEnd(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void zerosAtEnd(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        for (int val : arr)
            System.out.print(val + " ");

    }

}
