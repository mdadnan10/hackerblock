package paterns;

import java.util.Scanner;

public class ManmohanLovesPattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern1(n);
//        pattern2(n);
    }

    public static void pattern1(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                if (row % 2 == 0) {
                    if (col == 1 || col == row)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");
                } else System.out.print("1 ");
            }

            System.out.println();

        }

    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {

            //work
            for (int col = 1; col <= row; col++) {
                if (row == 1)
                    System.out.print(row + " ");
                else if (col == 1 || col == row)
                    System.out.print(row - 1 + " ");
                else
                    System.out.print(0 + " ");

            }

            // update
            System.out.println();

        }
    }
}
