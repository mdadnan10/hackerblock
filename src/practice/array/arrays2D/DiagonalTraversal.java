package practice.array.arrays2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {

        int[][] arr = takeInput();
        diagonalTraversal(arr);

    }

    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int row = 0; row < m; row++) {

            for (int col = 0; col < n; col++)
                arr[row][col] = sc.nextInt();

        }

        return arr;
    }

    public static void diagonalTraversal(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        int[] res = new int[m * n];
        int p = 0;

        int tnt = m + n - 1;

        for (int d = 0; d < tnt; d++) {

            int row = d < m ? 0 : d - m + 1; // if (d < m)  row = 0; else row = d - m + 1;
            int col = d < m ? d : m - 1; // if (d < m) col = d; else col = m - 1;

            ArrayList<Integer> list = new ArrayList<>();

            while (row < n && col >= 0) {

                list.add(arr[row][col]);
                row++;
                col--;

            }

            if (d % 2 == 0) {

                Collections.reverse(list);

                for (Integer integer : list) {

                    res[p] = integer;
                    p++;
                }

            } else {

                for (Integer integer : list) {

                    res[p] = integer;
                    p++;

                }

            }

        }

        for (int val : res)
            System.out.print(val + " ");

    }

}
