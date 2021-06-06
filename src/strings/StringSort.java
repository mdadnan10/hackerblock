package strings;

import java.util.Scanner;

public class StringSort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] str = takeInput();

        for (int i = 0; i < str.length; i++) {

            for (int j = i + 1; j < str.length; j++) {

                if (sortString(str[i], str[j])) {

                    String temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;

                }
            }

        }

        for (String val : str)
            System.out.println(val);

    }

    public static String[] takeInput() {

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++)
            str[i] = sc.next();

        return str;
    }

    public static void sort(String[] str) {

        for (int i = 0; i < str.length - 1; i++) {

            for (int j = i + 1; j < str.length; j++) {
                if ((int) str[i].charAt(0) > (int) str[j].charAt(0)) {
                    String temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                } else if ((int) str[i].charAt(0) == (int) str[j].charAt(0)) {
                    if (str[i].length() < str[j].length()) {
                        if (str[i].equals(str[j].substring(0, str[i].length()))) {
                            String temp = str[j];
                            str[j] = str[i];
                            str[i] = temp;
                        }
                    }
                }
            }

        }

        for (String val : str)
            System.out.println(val);

    }

    public static boolean sortString(String s1, String s2) {

        int i = 0;

        while (i < s1.length() && i < s2.length()) {

            if (s1.charAt(i) > s2.charAt(i))
                return true;
            if (s1.charAt(i) < s2.charAt(i))
                return false;

            i++;
        }

        return s1.length() < s2.length();
    }

}
