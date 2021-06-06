package practice.array.arrays1D;

import java.util.Scanner;

public class RainWaterTrapping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] building = takeInput();
            trappedWater(building);

        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void trappedWater(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];

        int lMax = arr[0];
        for (int i = 1; i < n; i++) {

            lMax = Math.max(Math.max(arr[i], arr[i - 1]), lMax);
            left[i] = lMax;

        }

        int rMax = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            rMax = Math.max(Math.max(arr[i], arr[i + 1]), rMax);
            right[i] = rMax;

        }

        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += Math.min(left[i], right[i]) - arr[i];

        }

        System.out.println(sum);
    }

}
