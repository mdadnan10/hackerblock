package strings;

import java.util.Scanner;

public class Jumbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aishaStr = sc.nextLine();
        String adnanStr = sc.nextLine();
        System.out.println(jumble(aishaStr, adnanStr));

    }

    public static boolean jumble(String str1, String str2) {

        int[] ch1 = new int[256];
        int[] ch2 = new int[256];

        char[] aishaWordChar = new char[str1.length()];
        char[] adnanWordChar = new char[str2.length()];

        int maxLen = Math.max(aishaWordChar.length, adnanWordChar.length);

        boolean[] status = new boolean[maxLen];

        for (int i = 0; i < str1.length(); i++) {
            aishaWordChar[i] = str1.charAt(i);
            ch1[str1.charAt(i)] = ch1[str1.charAt(i)] + 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            adnanWordChar[i] = str2.charAt(i);
            ch2[str2.charAt(i)] = ch2[str2.charAt(i)] + 1;
        }

        for (int i = 0; i < aishaWordChar.length; i++) {

            for (char c : adnanWordChar) {
                if (aishaWordChar[i] == c)
                    status[i] = true;
            }

        }

        int c1 = 0;
        int c2 = 0;

        while (c1 < ch1.length && c2 < ch2.length) {

            if (ch1[c1] > 0 && ch2[c2] > 0) {
                if (ch1[c1] != ch2[c2])
                    return false;
            }

            c1++;
            c2++;
        }

        return true;
    }

}
