package practice.array.arrays1D;

import java.util.Scanner;

public class HelpRahul {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        int n = sc.nextInt();
        System.out.println(search(arr, n));

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int search(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n) return i;

        return -1;
    }

}
