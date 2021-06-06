package practice.array.arrays2D;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateImage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        displayImage(rotateImage(arr));

    }

    public static int[][] takeInput() {

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++)
                arr[row][col] = sc.nextInt();

        }

        return arr;
    }

    public static void displayImage(int[][] arr) {

        for (int[] row : arr) {

            for (int col = 0; col < arr.length; col++)
                System.out.print(row[col] + " ");

            System.out.println();
        }

    }

    public static int[][] rotateImage(int[][] arr) {
        int len = arr.length;
        int[][] res = new int[len][len];
        int i = 0;

        for (int col = len - 1; col >= 0; col--) {

            for (int row = 0; row < len; row++)
                res[i][row] = arr[row][col];

            i++;
        }

        return res;
    }

}
