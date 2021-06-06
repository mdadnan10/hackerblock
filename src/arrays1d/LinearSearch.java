package arrays1d;

import java.util.Scanner;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();

        System.out.println(linearSearch(arr));

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int linearSearch(int[] arr) {

        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target)
                return i;

        }

        return -1;

    }

    public static int search(int[] arr) {
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i])
                return i;
        }

        return -1;
    }
}

