package dcb;

import java.util.Scanner;

public class RecursionAsciiSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ques = sc.nextLine();
        System.out.println("\n" + asciiSubsequence(ques, ""));

    }

    public static int asciiSubsequence(String ques, String ans){

        if (ques.length() == 0){
            System.out.print(ans + " ");
            return 1;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        int count = 0;

        count += asciiSubsequence(roq, ans);
        count += asciiSubsequence(roq, ans + ch);
        count += asciiSubsequence(roq, ans + (int)ch);

        return count;
    }

}
