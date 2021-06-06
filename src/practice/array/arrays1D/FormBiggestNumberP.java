package practice.array.arrays1D;

import java.util.Scanner;

public class FormBiggestNumberP {
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

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                String ans1 = arr[i] + "" + arr[j];
                String ans2 = arr[j] + "" + arr[i];

                if (Long.parseLong(ans1) < Long.parseLong(ans2)) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }

            }

        }

    }

}
