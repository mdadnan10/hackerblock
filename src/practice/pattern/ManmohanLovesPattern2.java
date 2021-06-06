package practice.pattern;

import java.util.Scanner;

public class ManmohanLovesPattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;
        for (int row = 1; row <= n; row++) {

            // work
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row)
                    System.out.print(val + " ");
                else System.out.print(0 + " ");
            }

            // update
            System.out.println();
            val++;
            if (row == 1) val = 1;

        }


    }
}
