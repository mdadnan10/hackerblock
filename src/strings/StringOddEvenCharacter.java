package strings;

import java.util.Scanner;

public class StringOddEvenCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(replace(str));
    }

    public static String replace(String str) {

        String s = "";

        for (int i = 1; i <= str.length(); i++) {


            if (i % 2 != 0) {
                char ch = str.charAt(i - 1);
                ch++;
                s += ch;
            } else {
                char ch = str.charAt(i - 1);
                --ch;
                s += ch;
            }

        }

        return s;
    }

}
