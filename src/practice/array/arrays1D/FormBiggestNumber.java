package practice.array.arrays1D;

import java.util.Scanner;

public class FormBiggestNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();
            formBiggestNumber(arr);

            StringBuilder ans = new StringBuilder();

            for (int val : arr)
                ans.append(val);

            System.out.println(ans);
        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void formBiggestNumber(int[] arr) {

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                num1.append(arr[i]);
                num1.append(arr[j]);

                num2.append(arr[j]);
                num2.append(arr[i]);

                if (Long.parseLong(num1.toString()) < Long.parseLong(num2.toString())) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

            num1 = new StringBuilder();
            num2 = new StringBuilder();

        }


    }

}
