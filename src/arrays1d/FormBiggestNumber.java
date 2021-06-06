package arrays1d;

import java.util.Scanner;

public class FormBiggestNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            int[] arr = takeInput();
            largestNumber(arr);
        }
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void largestNumber(int[] arr) {

        StringBuilder res = new StringBuilder();

        StringBuilder comb1 = new StringBuilder();
        StringBuilder comb2 = new StringBuilder();

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                comb1.append(arr[i]);
                comb1.append(arr[j]);

                comb2.append(arr[j]);
                comb2.append(arr[i]);

                if (Long.parseLong(comb1.toString()) < Long.parseLong(comb2.toString())) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

                comb1 = new StringBuilder();
                comb2 = new StringBuilder();

            }

        }

        for (int i : arr)
            res.append(i);

        System.out.println(res);
    }

}