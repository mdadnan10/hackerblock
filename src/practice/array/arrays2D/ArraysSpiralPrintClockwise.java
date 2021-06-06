package practice.array.arrays2D;

import java.util.Scanner;

public class ArraysSpiralPrintClockwise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        display(spiralAntiClockWise(arr));

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

        for (int i = 0; i < arr.length; i++)
            if (i == arr.length - 1) System.out.print(arr[i] + ", END");
            else System.out.print(arr[i] + ", ");

    }

    public static int[] spiralAntiClockWise(int[][] arr) {

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;

        int nel = arr.length * arr[0].length;
        int count = 0;

        int[] ans = new int[nel];
        int i = 0;

        while (count < nel) {
            for (int c = minCol; c <= maxCol && count < nel; c++) {
                ans[i] = arr[minRow][c];
                i++;
                count++;
            }

            minRow++;

            for (int r = minRow; r <= maxRow && count < nel; r++) {
                ans[i] = arr[r][maxCol];
                i++;
                count++;
            }

            maxCol--;

            for (int c = maxCol; c >= minCol && count < nel; c--) {
                ans[i] = arr[maxRow][c];
                i++;
                count++;
            }

            maxRow--;

            for (int r = maxRow; r >= minRow && count < nel; r--) {
                ans[i] = arr[r][minCol];
                i++;
                count++;
            }

            minCol++;
        }

        return ans;
    }

}
