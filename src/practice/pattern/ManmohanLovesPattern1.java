package practice.pattern;

import java.util.Scanner;

public class ManmohanLovesPattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            // work
            for (int col = 1; col <= row; col++) {
                if (row % 2 != 0)
                    System.out.print("1 ");
                else {
                    if (col == 1 || col == row)
                        System.out.print("1 ");
                    else System.out.print("0 ");
                }
            }

            // update
            System.out.println();
        }

    }
}
