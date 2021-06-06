package practice.array.arrays1D;

import java.util.Scanner;

public class Inverse {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        inverse(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void inverse(int[] arr) {

        int[] inverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            inverse[arr[i]] = i;

        }

        for (int i : inverse)
            System.out.print(i + " ");

    }

}
