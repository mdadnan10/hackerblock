package practice.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GameOfBits {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int l = 1; l <= tc; l++) {
            int[] sixes = takeInput();
            Arrays.sort(sixes);

            int count = 0;

            for (int i = 0; i < sixes.length - 1; i++) {

                if ((sixes[i] + 1) == sixes[i + 1])
                    count++;

            }

            System.out.println(count);
        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }


}
