package arrays1d;

import java.util.Scanner;

public class FormBiggestNumberPractice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();
            formBiggestNumber(arr);
            System.out.println();

        }

    }

    private static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    private static void formBiggestNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                String com1 = arr[i] + "" + arr[j];
                String com2 = arr[j] + "" + arr[i];

                if (Long.parseLong(com2) > Long.parseLong(com1)) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
