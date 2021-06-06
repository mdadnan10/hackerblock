package arrays2d;

import java.util.Scanner;

public class ArraysSpiralPrintAnticlockwise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        spiralAntiClockWise(arr);

    }

    public static int[][] takeInput() {

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[r].length; c++)
                arr[r][c] = sc.nextInt();

        }
        return arr;
    }

    public static void spiralAntiClockWise(int[][] arr) {

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;

        int nel = arr.length * arr[0].length;
        int count = 0;

        while (count < nel) {

            for (int r = minRow; r <= maxRow && count < nel; r++) {
                if (count == nel - 1)
                    System.out.print(arr[r][minCol] + ", END");
                else System.out.print(arr[r][minCol] + ", ");
                count++;
            }
            minCol++;

            for (int c = minCol; c <= maxCol && count < nel; c++) {
                if (count == nel - 1)
                    System.out.print(arr[maxRow][c] + ", END");
                else System.out.print(arr[maxRow][c] + ", ");
                count++;
            }
            maxRow--;

            for (int r = maxRow; r >= minRow && count < nel; r--) {
                if (count == nel - 1)
                    System.out.print(arr[r][maxCol] + ", END");
                else System.out.print(arr[r][maxCol] + ", ");
                count++;
            }
            maxCol--;

            for (int c = maxCol; c >= minCol && count < nel; c--) {
                if (count == nel - 1)
                    System.out.print(arr[minRow][c] + ", END");
                else System.out.print(arr[minRow][c] + ", ");
                count++;
            }
            minRow++;

        }
    }

}
