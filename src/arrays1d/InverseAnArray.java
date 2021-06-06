package arrays1d;

import java.util.Scanner;

public class InverseAnArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        inverse(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void inverse(int[] arr) {

        int[] inverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            inverse[arr[i]] = i;
        }

        for (int val : inverse)
            System.out.print(val + " ");

    }

    public static void inverse1(int[] arr) {

        int[] inverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            inverse[arr[i]] = i;

        }

        for (int val: inverse)
            System.out.print(val + " ");

    }

}
