package strings;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestDifferenceTriplet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr1 = takeInput(n);
        int[] arr2 = takeInput(n);
        int[] arr3 = takeInput(n);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        smallestDifference(arr1, arr2, arr3);

    }

    public static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int max(int i, int j, int k) {
        return Math.max(Math.max(i, j), k);
    }

    public static int min(int i, int j, int k) {
        return Math.min(Math.min(i, j), k);
    }

    public static void smallestDifference(int[] arr1, int[] arr2, int[] arr3) {

        int len = arr1.length;

        int resMax = 0;
        int resMid = 0;
        int resMin = 0;

        int i = 0;
        int j = 0;
        int k = 0;

        int diff = Integer.MAX_VALUE;

        while (i < len && j < len && k < len) {

            int sum = arr1[i] + arr2[j] + arr3[k];

            int max = max(arr1[i], arr2[j], arr3[k]);
            int min = min(arr1[i], arr2[j], arr3[k]);

            if (min == arr1[i])
                i++;
            else if (min == arr2[j])
                j++;
            else
                k++;

            if (diff > (max - min)) {

                diff = max - min;
                resMax = max;
                resMid = sum - (max + min);
                resMin = min;

            }

        }

        System.out.println(resMax + " " + resMid + " " + resMin);

    }

}
