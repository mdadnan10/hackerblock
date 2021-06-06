package arrays1d;

import java.util.Scanner;

public class ArrayContain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();
        System.out.println(contain(arr, target));

    }

    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static boolean contain(int[] arr, int target) {

        for (int val : arr) {

            if (val == target) return true;

        }

        return false;
    }

}
