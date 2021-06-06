package practice.recursion;

import java.util.Scanner;

public class KeyPadCodes {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        keyPad(str, "");
        System.out.println();
        System.out.println(count);

    }

    public static String codes(char ch) {

        switch (ch) {

            case '1':
                return "abc";

            case '2':
                return "def";

            case '3':
                return "ghi";

            case '4':
                return "jkl";

            case '5':
                return "mno";

            case '6':
                return "pqrs";

            case '7':
                return "tuv";

            case '8':
                return "wx";

            case '9':
                return "yz";

        }

        return "";
    }

    public static void keyPad(String str, String ans) {

        if (str.length() == 0) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        char ch = str.charAt(0);
        String ss = str.substring(1);

        String code = codes(ch);

        for (int i = 0; i < code.length(); i++)
            keyPad(ss, ans + code.charAt(i));

    }

}
