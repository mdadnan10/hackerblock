package practice.strings;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {

        String str = "edcab";
        sort(str);

    }

    public static void sort(String str) {

        char[] s = str.toCharArray();

        for (int i = 0; i < s.length - 1; i++) {

            for (int j = 0; j < s.length - i - 1; j++) {

                if (s[j + 1] < s[j]) {

                    char temp = s[j + 1];
                    s[j + 1] = s[j];
                    s[j] = temp;

                }

            }

        }

        String ans = String.valueOf(s);
        System.out.println(ans);

    }

}
