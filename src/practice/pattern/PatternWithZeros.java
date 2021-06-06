package practice.pattern;

import java.util.Scanner;

public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row)
                    System.out.print(row + "\t");
                else System.out.print(0 + "\t");
            }

            // update
            System.out.println();
        }

    }
}
