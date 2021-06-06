package arrays2d;

import java.util.Scanner;

public class WavePrintRowWise {
    public static void main(String[] args) {

        int[][] arr = takeInput();
        wavePrint(arr);

    }

    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++)
                matrix[row][col] = sc.nextInt();
        }

        return matrix;
    }

    public static void wavePrint(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int row = 0; row < m; row++) {

            if (row % 2 == 0) {
                for (int col = 0; col < n; col++) {
                    System.out.print(matrix[row][col] + ", ");
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col] + ", ");
                }
            }

        }

        System.out.println("END");

    }

}
