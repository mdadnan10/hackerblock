package strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        int max = 0;
//        char ch = ' ';
//
//        String[] str = takeInput();
//
//        for (int s = 0; s < str.length; s++) {
//            int[] characters = longestCP(str[s]);
//            for (int i = 0; i < characters.length; i++)
//                if (characters[i] > max) {
//                    max = characters[i];
//                    ch = (char) i;
//                }
//        }
//
//        System.out.println(ch);
//
//        for (int i = 1; i <= max; i++) {
//            if (ch == ' ')
//                System.out.println("");
//            else System.out.print(ch);
//        }

        String[] str = {"aab", "aas", "aac"};
        System.out.println(longest(str));

    }

    public static String[] takeInput() {

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++)
            str[i] = sc.next();

        return str;
    }

    public static int[] longestCP(String str) {

        int[] characters = new int[256];

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(0) == str.charAt(j)) {
                characters[str.charAt(j)] = characters[str.charAt(j)] + 1;
            } else {
                break;
            }
        }

        return characters;
    }

    public static void longestCp(String[] str) {

        int mi = Integer.MAX_VALUE;
        if (str.length == 0) System.out.println("");

        String c = str[0];
        for (int i = 1; i < str.length; i++) {

            int j = 0;
            int k = 0;
            int a = 0;

            while (j < c.length() && k < str[i].length()) {

//                if (c[j] == str[i]) a++;
//                else break;
                j++;
                k++;

            }
            mi = Math.min(mi, a);
        }
        System.out.println(c.substring(0, mi));
    }

    public static String longest(String[] str) {
        int size = str.length;

        if (size == 0)
            return "";

        if (size == 1)
            return str[0];

        Arrays.sort(str);

        int end = Math.min(str[0].length(), str[size - 1].length());

        int i = 0;
        while (i < end && str[0].charAt(i) == str[size - 1].charAt(i))
            i++;

        return str[0].substring(0, i);
    }

}
