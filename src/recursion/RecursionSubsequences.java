package recursion;

import java.util.Scanner;

public class RecursionSubsequences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ques = "abc";
        subSequences(ques, "");
        System.out.println();

        int n = (1 << ques.length());
        System.out.println(n);

    }

    public static void subSequences(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        char ch = ques.charAt(0);
        String ss = ques.substring(1);

        subSequences(ss, ans);
        subSequences(ss, ans + ch);

    }

}
