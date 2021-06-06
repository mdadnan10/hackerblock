package arrays1d;

import java.util.Scanner;

public class MaximumLengthBitonicSubArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            int[] arr = takeInput();
            maxLength(arr);
        }
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void maxLength(int[] arr) {

        int n = arr.length;

        int[] inc = new int[n];
        inc[0] = 1;
        int[] dec = new int[n];
        dec[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1])
                inc[i] = inc[i - 1] + 1;
            else
                inc[i] = 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[i + 1])
                dec[i] = dec[i + 1] + 1;
            else
                dec[i] = 1;
        }

        int max = inc[0] + dec[0] - 1;
        for (int i = 1; i < n; i++) {
            int j = inc[i] + dec[i] - 1;
            if (j > max)
                max = j;
        }


        System.out.println(max);
    }

}
