package practice.pattern;

import java.util.Scanner;

public class PatternDoubleSideArrow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        doubleArrow(n);

    }

    public static void doubleArrow(int n){

        int nsp = n - 1;
        int nspI = -1;
        int cst = 1;

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            // work
            int val = cst;
            for (int col = 1; col <= cst; col++) {
                System.out.print(val + " ");
                val--;
            }

            // spaces
            for (int csp = 1; csp <= nspI; csp++)
                System.out.print("  ");

            // work
            if (cst > 1 && cst < n) {
                for (int col = 1; col <= cst; col++) {
                    val++;
                    System.out.print(val + " ");
                }
            }

            // update
            System.out.println();
            if (row <= n / 2) {
                nsp -= 2;
                cst++;
                nspI += 2;
            } else {
                nsp += 2;
                cst--;
                nspI -= 2;
            }

        }

    }

}
