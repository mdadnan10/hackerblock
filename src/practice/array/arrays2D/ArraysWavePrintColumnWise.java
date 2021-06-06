package practice.array.arrays2D;

import java.util.Scanner;

public class ArraysWavePrintColumnWise {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] arr = takeInput();
        display(waveColumnWise(arr));

    }

    public static int[][] takeInput() {

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int row = 0; row < m; row++) {

            for (int col = 0; col < n; col++)
                arr[row][col] = sc.nextInt();

        }

        return arr;
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1)
                System.out.print(arr[i] + ", END");
            else System.out.print(arr[i] + ", ");

        }

    }

    public static int[] waveColumnWise(int[][] arr) {

        int[] wave = new int[arr.length * arr[0].length];
        int i = 0;

        for (int col = 0; col < arr[0].length; col++) {

            if (col % 2 == 0) {
                int row = 0;

                while (row < arr.length) {

                    wave[i] = arr[row][col];
                    i++;
                    row++;

                }
            } else {

                int row = arr.length - 1;

                while (row >= 0) {

                    wave[i] = arr[row][col];
                    i++;
                    row--;

                }

            }

        }

        return wave;
    }

}
