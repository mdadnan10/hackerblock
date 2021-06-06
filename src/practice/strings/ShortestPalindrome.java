package practice.strings;

import java.util.Scanner;

public class ShortestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(shortest(str));

    }

    public static String shortest(String str) {

        String rev = new StringBuilder(str).reverse().toString();

        for (int i = 0; i < str.length(); i++) {

            if (rev.substring(i).equals(str.substring(0, str.length() - i)))
                return rev.substring(0, i) + str;

        }

        return "";
    }

}
