package practice.strings;

import java.util.Scanner;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        longestCC(str);

    }

    public static void longestCC(String str) {

        int max = 1;
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                max = Math.max(count, max);
            } else count = 1;

        }

        System.out.println(max);

    }

}
