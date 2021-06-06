package NagarroTest;

import java.util.ArrayList;
import java.util.Scanner;

public class CountGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        takeInput();

    }

    public static void takeInput() {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();


        countGame(arr, k);
    }

    public static void countGame(int[] arr, int k) {

        int count = 0;

        for (int i : arr) {

            int times = i / k;
            count += times;

            if (i % k != 0) count += 1;

        }

        System.out.println(count);

    }

}
