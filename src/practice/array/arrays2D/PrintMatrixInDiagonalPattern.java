package practice.array.arrays2D;

import java.util.ArrayList;
import java.util.Collections;

public class PrintMatrixInDiagonalPattern {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        diagonal(arr);
//        matrixDiagonally(arr);
        diagonal(arr);

    }

    public static void diagonal(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int tlt = m + n - 1;

        int[] res = new int[m * n];
        int i = 0;

        for (int d = 0; d < tlt; d++) {

            int row = d < n ? 0 : d - n + 1;
            int col = d < n ? d : n - 1;

            ArrayList<Integer> list = new ArrayList<>();

            while (row < m && col >= 0) {

                list.add(mat[row][col]);
                row++;
                col--;

            }

            if (d % 2 == 0) {

                Collections.reverse(list);

                for (Integer val : list) {

                    res[i] = val;
                    i++;

                }

            } else {

                for (Integer val : list) {

                    res[i] = val;
                    i++;

                }

            }

        }

        for (int val : res)
            System.out.print(val + " ");

    }

    public static void matrixDiagonally(int[][] arr) {

        int n = arr.length;

        int[] res = new int[n * n];
        int i = 0;

        for (int r = 0; r < n; r++) {

            if (r % 2 == 0) {
                int row = r;
                int col = 0;

                while (row >= 0) {

                    res[i] = arr[row][col];
                    i++;

                    row--;
                    col++;
                }
            } else {

                int row = 0;
                int col = r;

                while (col >= 0) {

                    res[i] = arr[row][col];
                    i++;

                    row++;
                    col--;
                }

            }

        }

        for (int c = 1; c < n; c++) {

            if (c % 2 != 0) {

                int row = c;
                int col = n - 1;

                while (row <= n - 1) {

                    res[i] = arr[row][col];
                    i++;

                    row++;
                    col--;
                }

            } else {
                int row = n - 1;
                int col = c;

                while (col <= n - 1) {

                    res[i] = arr[row][col];
                    i++;

                    row--;
                    col++;
                }
            }

        }

        for (int val : res)
            System.out.print(val + " ");

    }

    public static void diagonalMove(int[][] arr) {

        int[] res = new int[arr.length * arr.length];
        int t = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                int row = i;
                int col = 0;

                while (row >= 0 && col <= i) {

                    res[t] = arr[row][col];
                    t++;

                    row--;
                    col++;
                }
            } else {

                int row = 0;
                int col = i;

                while (row <= i && col >= 0) {

                    res[t] = arr[row][col];
                    t++;

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

                            res[t] = arr[row][col];
                            t++;

                            row--;
                            col++;
                        }
                    } else {
                        int row = j;
                        int col = i;

                        while (row <= i && col >= j) {

                            res[t] = arr[row][col];
                            t++;

                            row++;
                            col--;
                        }
                    }

                }

            }

        }

        for (int val : res)
            System.out.print(val + " ");
    }

}
