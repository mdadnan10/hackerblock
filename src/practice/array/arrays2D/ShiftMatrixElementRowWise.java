package practice.array.arrays2D;

import java.util.Scanner;

public class ShiftMatrixElementRowWise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        int[][] arr = {{5, 4, 5, 3, 6, 1}, {1, 2, 6, 4, 8, 10}, {10, 6, 10, 5, 3, 3}, {1, 2, 3, 8, 9, 9}, {2, 7, 1, 7, 2, 1}, {7, 6, 6, 7, 2, 5}};
        int[][] matrix = takeInput();
        int k = sc.nextInt();
        display(shiftElementKWise(matrix, k));

    }

    public static int[][] takeInput() {

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        return matrix;
    }

    public static void display(int[][] matrix) {

        for (int[] row : matrix) {

            for (int col = 0; col < matrix[0].length; col++)
                System.out.print(row[col] + " ");

            System.out.println();
        }
    }

    public static int[][] shiftElementKWise(int[][] matrix, int k) {

        int[][] res = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {

            int j = 0;

            for (int col = k; col < matrix[row].length; col++) {
                res[row][j] = matrix[row][col];
                j++;
            }

            for (int col = 0; col < k; col++) {
                res[row][j] = matrix[row][col];
                j++;
            }

        }

        return res;
    }

}
