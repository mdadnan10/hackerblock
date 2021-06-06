package practice.array.arrays1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PairOfRose {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();
            int limit = sc.nextInt();
            pair(arr, limit);

        }
    }


    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void pair(int[] arr, int limit) {

        int l = 0;
        int r = 0;

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum > limit)
                j--;
            else if (sum < limit)
                i++;
            else {
                l = arr[i];
                r = arr[j];
                i++;
                j--;
            }
        }

        System.out.println("Deepak should buy roses whose prices are " + l + " and " + r + ".");

    }

}
