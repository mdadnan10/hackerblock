package arrays1d;

import java.util.Scanner;

public class MaxValueInArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        max(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void max(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int val: arr) {
            if (val > max)
                max = val;
        }
        System.out.println(max);
    }
}
