package practice.pattern;

import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            // work
            char even = 'b';
            char odd = 'a';
            if (row % 2 == 0) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(even + " ");
                    even += 2;
                }
            } else {
                for (int col = 1; col <= row; col++) {
                    System.out.print(odd + " ");
                    odd += 2;
                }
            }

            // update
            System.out.println();

        }

    }
}
