package NagarroTest;

import java.util.Scanner;

public class ShortestPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(shortestPalindromes(str));

    }

    public static String shortestPalindromes(String str) {

        String rev = new StringBuilder(str).reverse().toString();

        for (int i = 0; i < str.length(); i++) {

            if (rev.substring(i).equals(str.substring(0, str.length() - i)))
                return rev.substring(0, i) + str;

        }

        return "";
    }

    public static String shortestPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (j >= 0) {

            if (str.charAt(i) == str.charAt(j)) i++;

            j--;
        }

        if (i == str.length())
            return str;

        String end = str.substring(i);
        String start = new StringBuilder(end).reverse().toString();
        String mid = shortestPalindrome(str.substring(0, i));

        return start + mid + end;
    }

}
