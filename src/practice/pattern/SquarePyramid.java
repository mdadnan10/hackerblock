package practice.pattern;

import java.util.Scanner;

public class SquarePyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            // work
            int val = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(val * val + " ");
                val++;
            }

            // update
            System.out.println();

        }

    }
}