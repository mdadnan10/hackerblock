package dcb;

import java.util.Scanner;

public class FindAllPAthsOfAMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = takeInput(m, n);
        paths(matrix, 0, m - 1, 0, n - 1, "");

    }

    public static int[][] takeInput(int m, int n) {

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        }

        return matrix;
    }

    public static void paths(int[][] matrix, int cr, int er, int cc, int ec, String ans) {

        if (cr == er && cc == ec) {
            System.out.println(ans + matrix[cr][cc]);
            return;
        }

        if (cr > er || cc > ec) return;

        paths(matrix, cr, er, cc + 1, ec, ans + matrix[cr][cc] + " - ");
        paths(matrix, cr + 1, er, cc, ec, ans + matrix[cr][cc] + " - ");

    }

}
