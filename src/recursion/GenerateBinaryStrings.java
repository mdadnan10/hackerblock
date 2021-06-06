package recursion;

import java.util.Scanner;

public class GenerateBinaryStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            String str = sc.next();
            char[] chars = str.toCharArray();

            wildCard(chars, 0);
            System.out.println();
        }

    }

    public static void wildCard(char[] chars, int vidx) {

        if (chars.length == vidx) {
            System.out.print(chars);
            System.out.print(" ");
            return;
        }

        if (chars[vidx] == '?') {

            chars[vidx] = '0';
            wildCard(chars, vidx + 1);

            chars[vidx] = '1';
            wildCard(chars, vidx + 1);

            chars[vidx] = '?';
        } else
            wildCard(chars, vidx + 1);

    }

}
