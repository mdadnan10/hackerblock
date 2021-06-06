package practice.array.arrays2D;

import java.util.Scanner;

public class ArraysWavePrintRowWise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        display(printWave(arr));

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

    public static int[] printWave(int[][] arr) {

        int[] ans = new int[arr.length * arr[0].length];
        int i = 0;

        for (int row = 0; row < arr.length; row++) {

            if (row % 2 == 0) {
                int col = 0;

                while (col < arr[row].length) {
                    ans[i] = arr[row][col];
                    i++;
                    col++;
                }

            } else {
                int col = arr[row].length - 1;

                while (col >= 0) {
                    ans[i] = arr[row][col];
                    i++;
                    col--;
                }

            }
        }

        return ans;
    }

}
