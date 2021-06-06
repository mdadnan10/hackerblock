package practice.array.arrays1D;

import java.util.Scanner;

public class ReverseAnArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        reverseUsingSwap(arr);
//        int[] reverse = reverse(arr);
//        display(reverse);
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void display(int[] arr) {

        for (int val : arr)
            System.out.println(val);

    }

    public static int[] reverse(int[] arr) {

        int[] reverse = new int[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            reverse[j] = arr[i];

            j++;
        }

        return reverse;
    }

    public static void reverseUsingSwap(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int val : arr)
            System.out.println(val);

    }

}
