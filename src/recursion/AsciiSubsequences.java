package recursion;

import java.util.Scanner;

public class AsciiSubsequences {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ques = sc.next();
        asciiSubsequences(ques, "");
        System.out.println();

        System.out.println(count);

    }

    public static void asciiSubsequences(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.print(ans + " ");
            count += 1;
            return;
        }

        char ch = ques.charAt(0);
        String ss = ques.substring(1);

        asciiSubsequences(ss, ans);
        asciiSubsequences(ss, ans + ch);
        asciiSubsequences(ss, ans + (int) ch);
    }

}
