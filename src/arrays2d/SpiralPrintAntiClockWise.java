package arrays2d;

import java.util.Scanner;

public class SpiralPrintAntiClockWise {
    public static void main(String[] args) {

        int[][] matrix = takeInput();
        spiral(matrix);

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

    public static void spiral(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int cr = 0;
        int er = m - 1;
        int cc = 0;
        int ec = n - 1;

        int count = m * n;
        int i = 0;
        while (i < count) {

            for (int row = cr; row <= er && i < count; row++) {
                System.out.print(matrix[row][cc] + ", ");
                i++;
            }

            cc += 1;

            for (int col = cc; col <= ec && i < count; col++) {
                System.out.print(matrix[er][col] + ", ");
                i++;
            }

            er -= 1;

            for (int row = er; row >= cr && i < count; row--) {
                System.out.print(matrix[row][ec] + ", ");
                i++;
            }

            ec -= 1;

            for (int col = ec; col >= cc && i < count; col--) {
                System.out.print(matrix[cr][col] + ", ");
                i++;
            }

            cr += 1;

        }

        System.out.println("END");

    }
}
