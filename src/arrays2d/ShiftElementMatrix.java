package arrays2d;

import java.util.Scanner;

public class ShiftElementMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        int k = sc.nextInt();
        shiftElementRowWise(arr, k);
    }

    public static int[][] takeInput() {

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();

        }

        return arr;
    }

    public static void shiftElementRowWise(int[][] arr, int k) {

        int j = 0;
        while (j < arr.length) {

            for (int i = k; i < arr[0].length; i++)
                System.out.print(arr[j][i] + " ");

            for (int i = 0; i < k; i++)
                System.out.print(arr[j][i] + " ");

            System.out.println();
            j++;
        }
    }
}

