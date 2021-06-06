package recursion;

import java.util.Scanner;

public class RecursionKeypadCodes {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ques = sc.next();

        keypadCode(ques, "");
        System.out.println();

        System.out.println(count);

    }

    public static String getCode(char ch) {

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

            default:
                return "";

        }

    }

    public static void keypadCode(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.print(ans + " ");
            count += 1;
            return;
        }

        char ch = ques.charAt(0);
        String ss = ques.substring(1);

        String code = getCode(ch);

        for (int i = 0; i < code.length(); i++)
            keypadCode(ss, ans + code.charAt(i));

    }

}
