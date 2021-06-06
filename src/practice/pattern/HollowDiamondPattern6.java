package practice.pattern;

import java.util.Scanner;

public class HollowDiamondPattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n / 2 + 1;
        int nsp = -1;

        for (int row = 1; row <= n; row++) {

            // stars
            for (int col = 1; col <= nst; col++)
                System.out.print("* ");

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            // stars
            int col = 1;
            if (row == 1 || row == n)
                col = 2;
            for (; col <= nst; col++)
                System.out.print("* ");

            // update
            System.out.println();
            if (row <= n / 2) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }

        }

    }
}
