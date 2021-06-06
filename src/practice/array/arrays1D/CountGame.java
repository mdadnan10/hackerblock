package practice.array.arrays1D;

import java.util.Scanner;

public class CountGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = takeInput(n);
        count(arr, k);

    }

    public static int[] takeInput(int n){

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void count(int[] arr, int k){

        int totalCount = 0;

        for (int j : arr) {

            int times = j / k;
            totalCount += times;

            if (j % k != 0) totalCount++;

        }

        System.out.println(totalCount);

    }

}
