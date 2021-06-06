package arrays1d;

import java.util.Scanner;

public class RainWaterTapping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            int[] arr = takeInput();
            System.out.println(rainTapped(arr));
        }
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int rainTapped(int[] arr) {

        int n = arr.length;
        int res = 0;

        for (int i = 1; i < n - 1; i++) {

            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

}
