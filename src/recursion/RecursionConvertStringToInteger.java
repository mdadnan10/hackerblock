package recursion;

import java.util.Scanner;

public class RecursionConvertStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringToInteger(str, 0);

    }

    public static void stringToInteger(String ques, int ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        int ch = ques.charAt(0) - '0';
        String ss = ques.substring(1);

        stringToInteger(ss, ans * 10 + ch);

    }

}
