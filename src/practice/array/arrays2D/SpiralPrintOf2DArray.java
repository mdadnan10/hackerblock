package practice.array.arrays2D;

import java.util.Scanner;

public class SpiralPrintOf2DArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] arr = takeInput();
        spiralPrint(arr);

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

    public static void spiralPrint(int[][] arr) {

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;

        int nel = arr.length * arr[0].length;
        int count = 0;

        while (count < nel) {
            for (int c = minCol; c <= maxCol && count < nel; c++) {
                System.out.print(arr[minRow][c] + " ");
                count++;
            }

            minRow++;

            for (int r = minRow; r <= maxRow && count < nel; r++) {
                System.out.print(arr[r][maxCol] + " ");
                count++;
            }

            maxCol--;

            for (int c = maxCol; c >= minCol && count < nel; c--) {
                System.out.print(arr[maxRow][c] + " ");
                count++;
            }

            maxRow--;

            for (int r = maxRow; r >= minRow && count < nel; r--) {
                System.out.print(arr[r][minCol] + " ");
                count++;
            }

            minCol++;
        }

    }

}
