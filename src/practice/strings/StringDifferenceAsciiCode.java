package practice.strings;

import java.util.Scanner;

public class StringDifferenceAsciiCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        difference(str);

    }

    public static void difference(String str) {

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = i + 1;

        while (j < str.length()) {

            int diff = str.charAt(j) - str.charAt(i);
            ans.append(str.charAt(i));
            ans.append(diff);

            i++;
            j++;
        }

        ans.append(str.charAt(i));

        System.out.println(ans);

    }

}
