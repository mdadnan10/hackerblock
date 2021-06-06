package practice.pattern;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

        for (int row = 1; row <= n; row++) {

            //spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            // work
            int val = row;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                if (cst <= nst / 2)
                    val++;
                else val--;

            }

            // update
            System.out.println();
            nsp--;
            nst += 2;

        }

    }
}
