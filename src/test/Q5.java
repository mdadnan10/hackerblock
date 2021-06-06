package test;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {

        String str = "bbaa";
        String check = "aba";
        sub(str, check);
    }

    public static void sub(String a, String b) {

        int max = Integer.MAX_VALUE;
        String ans = "";

        for (int i = 0; i < a.length(); i++) {

            for (int j = i + 1; j <= a.length(); j++) {

                String ss = a.substring(i, j);

                if (ss.length() >= b.length()) {
                    System.out.println(ss);
                    if (available(ss, b)) {

                        if (ss.length() < max) {
                            max = ss.length();
                            ans = ss;
                        }

                    }
                }


            }

        }

        System.out.println(ans);

    }

    public static boolean available(String ss, String c) {

        ArrayList<Character> ans = new ArrayList<Character>();
        for (int i = 0; i < ss.length(); i++)
            ans.add(ss.charAt(i));

        char[] chars = c.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (!ans.contains(chars[i])) return false;

        }

        return true;
    }

}
