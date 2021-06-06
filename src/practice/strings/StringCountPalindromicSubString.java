package practice.strings;

import java.util.Scanner;

public class StringCountPalindromicSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(count(str));

    }

    public static int count(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String ss = str.substring(i, j);

                if (isPalindrome(ss))
                    count++;

            }

        }

        return count;
    }

    public static boolean isPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }

}
