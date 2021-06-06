package practice.pattern;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = 0;
        int nst = 2 * n + 1;

        int num = n;

        for (int row = 1; row <= 2 * n + 1; row++) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            // stars
            int val = num;
            for (int col = 1; col <= nst; col++) {
                System.out.print(val + " ");
                if (col <= num)
                    val--;
                else val++;
            }

            // update
            System.out.println();
            if (row <= n) {
                nsp++;
                nst -= 2;
                num--;
            } else {
                nsp--;
                nst += 2;
                num++;
            }
        }

    }
}
