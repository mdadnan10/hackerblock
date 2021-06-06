package practice.strings;

import java.util.Scanner;

public class GoodSubSTring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(goodSubStrings(str));
    }

    public static int goodSubStrings(String str) {

        int i = 0, count = 0, present = 0;

        while (i < str.length() - 2) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                present++;
                if (present > count)
                    count = present;
            } else {
                present = 0;
            }

            i++;
        }

        return count;
    }

}
