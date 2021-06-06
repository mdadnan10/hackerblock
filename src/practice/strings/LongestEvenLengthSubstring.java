package practice.strings;

import java.util.Scanner;

public class LongestEvenLengthSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            String str = sc.next();
            subString(str);
        }

    }

    public static void subString(String str) {

        int max = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String ss = str.substring(i, j);
                int len = 0;
                if (ss.length() % 2 == 0)
                    len = countEvenLength(ss);

                max = Math.max(len, max);
            }

        }

        System.out.println(max);

    }

    public static int countEvenLength(String str) {

        int left = 0;
        int right = 0;

        for (int i = 0; i < str.length() / 2; i++) {

            left += (str.charAt(i) - '0');

        }

        for (int i = str.length() / 2; i < str.length(); i++) {

            right += (str.charAt(i) - '0');

        }

        if (left == right) return str.length();
        else return 0;
    }

}
