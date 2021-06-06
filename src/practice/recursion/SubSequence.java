package practice.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SubSequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        String ques = "";
        for (int j : arr) ques += j;
        subSequence(ques, "", 10);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void subSequence(String ques, String ans, int target) {

        if (ques.length() == 0) {
            int sum = 0;
            char[] val = ans.toCharArray();
            for (char c : val) {
                sum += c - '0';
            }

            if (target == sum) {
                for (int i = ans.length() - 1; i >= 0; i--)
                    System.out.print(ans.charAt(i) + " ");
                System.out.println();
            }
            return;
        }

        char ch = ques.charAt(0);
        String ss = ques.substring(1);

        subSequence(ss, ans + "", target);
        subSequence(ss, ans + ch, target);

    }

    public static void subSets(int[] arr, int count, int vidx, int target) {


    }

}
