package practice.pattern;

import java.util.Scanner;

public class PatternLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;

        for (int row = 1; row <= n; row++) {

            // work
            for (int col = 1; col <= row; col++) {
                System.out.print(val + "\t");
                val++;
            }

            // update
            System.out.println();
        }

    }
}
