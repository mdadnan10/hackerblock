package practice.array.arrays1D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInAnArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        leaders(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int maxValue(int[] arr, int i) {

        int max = Integer.MIN_VALUE;
        for (int j = i + 1; j < arr.length; j++) {

            if (arr[j] > max)
                max = arr[j];

        }

        return max;
    }

    public static void leaders(int[] arr) {

        ArrayList<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int max = maxValue(arr, i);

            if (arr[i] >= max) leaders.add(arr[i]);

        }

        Collections.sort(leaders);

        for (int val : leaders)
            System.out.print(val + " ");
    }

}
