package practice.strings;

import java.util.Scanner;

public class FormMinimumNumber {
    public static void main(String[] args) {

        min("II");

    }

    public static void formMinimumNumber(String[] str) {


    }

    public static void min(String str) {

        int count = 1;

        int ans[] = new int[str.length() + 1];

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == 'I') {
                ans[i] = count;
                count++;

                for (int j = i - 1; j >= 0 && str.charAt(j) == 'D'; j--) {
                    ans[j] = count;
                    count++;
                }
            }

        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }

        System.out.println();
    }
}
