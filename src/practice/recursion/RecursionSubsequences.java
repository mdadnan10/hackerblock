package practice.recursion;

import java.util.Scanner;

public class RecursionSubsequences {
    static int count = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        subSequence(str, "");
        System.out.println();
        System.out.println(count);
    }

    public static void subSequence(String ques, String ans){

        if (ques.length() == 0){
            System.out.print(ans + " ");
            count++;
            return;
        }

        char ch = ques.charAt(0);
        String ss = ques.substring(1);

        subSequence(ss, ans);
        subSequence(ss, ans + ch);

    }

}
