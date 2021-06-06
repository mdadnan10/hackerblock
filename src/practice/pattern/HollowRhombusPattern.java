package practice.pattern;

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n -1;

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            //stars
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row ==n || col == 1 || col == n)
                    System.out.print("* ");
                else System.out.print("  ");
            }

            // update
            System.out.println();
            nsp--;

        }

    }
}
