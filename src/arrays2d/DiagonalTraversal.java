package arrays2d;

import java.util.Scanner;

public class DiagonalTraversal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] ar = takeInput();
        diagonalTraverse(ar);

    }

    public static int[][] takeInput() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < m; col++)
                arr[row][col] = sc.nextInt();

        }

        return arr;
    }

    public static void diagonalTraverse(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;
        int[] ans = new int[row * col];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < row && j < col) {

            while (i >= 0 && j < col) {
                ans[index] = arr[i][j];
                index++;
                j++;
                i--;
            }
            i++;
            if (j == col) {
                i++;
                j--;
            }
            while (j >= 0 && i < row) {
                ans[index] = arr[i][j];
                index++;
                i++;
                j--;
            }
            j++;
            if (i == row) {
                i--;
                j++;
            }
        }

        for (int val: ans)
            System.out.print(val + " ");

    }

    public static void diagonalMove(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                int row = i;
                int col = 0;

                while (row >= 0 && col <= i) {
                    System.out.print(arr[row][col] + " ");

                    row--;
                    col++;
                }
            } else {

                int row = 0;
                int col = i;

                while (row <= i && col >= 0) {
                    System.out.print(arr[row][col] + " ");
                    row++;
                    col--;
                }

            }

            if (i == arr.length - 1) {

                for (int j = 1; j < arr[i].length; j++) {

                    if (j % 2 == 0) {
                        int row = i;
                        int col = j;

                        while (row >= j && col <= i) {
                            System.out.print(arr[row][col] + " ");
                            row--;
                            col++;
                        }
                    } else {
                        int row = j;
                        int col = i;

                        while (row <= i && col >= j) {
                            System.out.print(arr[row][col] + " ");
                            row++;
                            col--;
                        }
                    }

                }

            }

        }

    }

}
