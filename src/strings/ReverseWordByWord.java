package strings;

import java.util.Scanner;

public class ReverseWordByWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= tc; i++) {
            String str = sc.nextLine();
            System.out.println(reverseWords(str));
        }
    }

    public static String reverseWords(String str) {

        String rev = "";

        int i = str.length() - 1;

        while (i >= 0) {

            while (i >= 0 && str.charAt(i) == ' ') i--;

            int j = i;
            if (i < 0) break;

            while (i >= 0 && str.charAt(i) != ' ') i--;

            if (rev.isEmpty())
                rev = rev.concat(str.substring(i + 1, j + 1));
            else
                rev = rev.concat(" " + str.substring(i + 1, j + 1));
        }

        return rev;

    }

}
