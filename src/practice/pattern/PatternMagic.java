package practice.pattern;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nsp = -1;
        int nst = n;

        for (int row = 1; row <= 2 * n - 1; row++) {

            // stars
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("* ");

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            // stars
            int cst = 1;
            if (row == 1 || row == 2 * n - 1)
                cst = 2;
            for (; cst <= nst; cst++) {
                System.out.print("* ");
            }

            // update
            System.out.println();
            if (row < n) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }


        }

    }
}

