package strings;

import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "cbaeicdouea";
        subString(str);

    }

    public static void subString(String str) {

        int count = 0;
        int present = 0;

        int i = 0;
        while (i < str.length()) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                present++;

                if (count < present)
                    count = present;

            } else present = 0;

            i++;
        }

        System.out.println(count);
    }

}
