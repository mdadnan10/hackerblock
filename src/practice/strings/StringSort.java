package practice.strings;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {

        String[] str = takeInput();
        stringSort(str);

        for (String s : str)
            System.out.println(s);

    }

    public static String[] takeInput() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++)
            str[i] = sc.next();

        return str;
    }

    public static void stringSort(String[] str) {

        for (int i = 0; i < str.length - 1; i++) {

            for (int j = i + 1; j < str.length; j++)
                if (isCompareTo(str[i], str[j])) {

                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;

                }

        }

    }

    public static boolean isCompareTo(String s1, String s2) {

        int i = 0;

        while (i < s1.length() && i < s2.length()) {

            if (s1.charAt(i) > s2.charAt(i)) return true;
            if (s1.charAt(i) < s2.charAt(i)) return false;

            i++;
        }

        if (s1.length() < s2.length()) return true;
        else return false;
    }

}
