package strings;

import java.util.Scanner;

public class StringDifferencesInAsciiCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        stringDifference(str);

    }

    public static void stringDifference(String str) {

        int i = 0;
        int j = 1;

        int diff = 0;

        while (j < str.length()) {

            int ch1 = str.charAt(i);
            int ch2 = str.charAt(j);

            diff = ch2 - ch1;

            if (i == 0)
                System.out.print(str.charAt(i));
            System.out.print(diff);
            System.out.print(str.charAt(j));

            i++;
            j++;
        }

    }

}
