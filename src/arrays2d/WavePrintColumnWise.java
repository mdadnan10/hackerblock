package arrays2d;

import java.util.Scanner;

public class WavePrintColumnWise {
    public static void main(String[] args) {

        int[][] matrix = takeInput();
        printColumnWise(matrix);

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

    public static void printColumnWise(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int col = 0; col < n; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < m; row++)
                    System.out.print(matrix[row][col] + ", ");
            } else {
                for (int row = m - 1; row >= 0; row--)
                    System.out.print(matrix[row][col] + ", ");
            }

        }

        System.out.println("END");

    }
}
