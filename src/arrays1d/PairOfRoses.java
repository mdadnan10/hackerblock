package arrays1d;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            int[] arr = takeInput();
            pairOfRoses(arr);
        }
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        return arr;
    }

    public static void pairOfRoses(int[] arr) {

        int m = sc.nextInt();

        int l = 0;
        int r = 0;

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            if (arr[i] + arr[j] < m)
                i++;
            else if (arr[i] + arr[j] > m)
                j--;
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
