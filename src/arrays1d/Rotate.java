package arrays1d;

import java.util.Scanner;

public class Rotate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        display(arr);
        display(rotate2(arr));

    }

    public static int[] takeInput() {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void display(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }

    public static int[] rotate(int[] arr) {

        int rot = sc.nextInt();

        rot = rot % arr.length;
        while (rot > 0) {

            int temp = arr[arr.length - 1];

            for (int j = arr.length - 1; j >= 1; j--)
                arr[j] = arr[j - 1];

            arr[0] = temp;

            rot--;
        }

        return arr;
    }

    public static void reverse(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

    public static void reverse(int[] arr, int si, int ei) {

        int i = si;
        int j = ei;

        while (i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

    public static int[] rotate2(int[] arr) {

        int rot = sc.nextInt();

        rot = rot % arr.length;

        reverse(arr, 0, arr.length - rot - 1); //
        reverse(arr, arr.length - rot, arr.length - 1); // rot no

        reverse(arr); // whole array

        return arr;
    }
}
