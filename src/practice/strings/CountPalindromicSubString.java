package practice.strings;

import java.util.Scanner;

public class CountPalindromicSubString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        countPalindromicSubString(str);

    }

    public static void countPalindromicSubString(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String ss = str.substring(i, j);

                if (isPalindrome(ss))
                    count++;


            }

        }

        System.out.println(count);

    }

    public static boolean isPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

}
