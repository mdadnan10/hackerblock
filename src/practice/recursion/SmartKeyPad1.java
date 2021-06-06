package practice.recursion;

import java.util.Scanner;

public class SmartKeyPad1 {
    static String[] table = {" ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        smartKeypad(str, "");

    }

    public static void smartKeypad(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        int ch = str.charAt(0) - '0';
        String ss = str.substring(1);

        String codes = table[ch];

        for (int i = 0; i < codes.length(); i++)
            smartKeypad(ss, ans + codes.charAt(i));

    }

}
