package practice.recursion;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = takeInput();
        reverse(arr, 0);

    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void reverse(int[] arr, int vidx) {

        if (arr.length == vidx) return;

        reverse(arr, vidx + 1);
        System.out.println(arr[vidx]);

    }

}
