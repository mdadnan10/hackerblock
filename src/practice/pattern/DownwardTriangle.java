package practice.pattern;

import java.util.Scanner;

public class DownwardTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n;
        int nsp = 0;

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            // stars
            for (int col = 1; col <= nst; col++)
                System.out.print("* ");

            // update
            System.out.println();
            nst--;
            nsp++;

        }

    }
}
