package practice.array.arrays1D;

import java.util.Scanner;

public class DivisibleSubArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        int tc = sc.nextInt();
//
//        for (int i = 1; i <= tc; i++) {
        int[] n = {1, 1, 1, 1, 1};
        int t = n.length;
        System.out.println(subArrays(n, t));
//        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int subArrays(int[] arr, int t) {

        int count = 0;

        for (int k = 0; k < arr.length; k++) {

            for (int i = 0; i < arr.length; i++) {

                int sum = 0;

                for (int j = k; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                    sum += arr[j];
                }

                System.out.println();

                if (sum == t) {
                    count++;
                }

            }

        }

        return count;
    }

}
