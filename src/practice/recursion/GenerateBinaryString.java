package practice.recursion;

import java.util.Scanner;

public class GenerateBinaryString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int tc = Integer.parseInt(sc.nextLine());

//        for (int i = 1; i <= tc; i++) {

        String str = "1??0?101";
        wildCard(str, "");

//        }

    }

    public static void wildCard(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ss = str.substring(1);

        if (ch == '?') {

            wildCard(ss, ans + "0");
            wildCard(ss, ans + "1");

        } else wildCard(ss, ans + ch);

    }

}
