package practice.pattern;

import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

        int value = 1;

        for (int row = 1; row < 2 * n; row++) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            // stars
            int val = value;
            for (int col = 1; col <= nst; col++) {
                System.out.print(val + " ");
                if (col <= nst / 2)
                    val++;
                else val--;
            }

            // update
            System.out.println();
            if (row < n) {
                nsp--;
                nst += 2;
                value++;
            } else {
                nsp++;
                nst -= 2;
                value--;
            }
        }

    }
}
