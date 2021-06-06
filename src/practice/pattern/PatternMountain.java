package practice.pattern;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = 2 * n - 3;
        int cst = 1;

        for (int row = 1; row <= n; row++) {

            // work
            int val = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(val + "\t");
                val++;
            }

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            // work
            if (row == n)
                val--;
            for (int col = 1; col <= cst; col++) {
                val--;
                System.out.print(val + "\t");
            }

            // update
            System.out.println();
            nsp -= 2;
            cst++;
            if (row == n - 1)
                cst = n - 1;

        }

    }
}
