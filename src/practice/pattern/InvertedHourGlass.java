package practice.pattern;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = 2 * n - 1;
        int nst = 1;
        int cent = n;

        for (int row = 1; row <= 2 * n + 1; row++) {

            // work stars
            int val = n;
            for (int col = 1; col <= nst; col++) {
                System.out.print(val + " ");
                val--;
            }

            // spaces
            for (int csp = nsp; csp >= 1; csp--)
                System.out.print("  ");

            // stars
            val++;
            for (int col = 1; col <= nst; col++) {
                System.out.print(val + " ");
                val++;
            }

            // update
            System.out.println();
            if (row == n) {

                for (int col = 1; col <= 2 * n + 1; col++) {
                    System.out.print(cent + " ");
                    if (col <= n) cent--;
                    else cent++;
                    if (col == 2 * n + 1)
                        System.out.println();
                }

                nst = n + 1;
                nsp = -1;
            }

            if (row < n) {
                nst++;
                nsp -= 2;
            } else {
                nst--;
                nsp += 2;
            }
        }

    }
}
