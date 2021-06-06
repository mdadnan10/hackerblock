package strings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {

        String res = "";

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) != str.charAt(i + 1))
                res += str.charAt(i);
        }

        res += str.charAt(str.length() - 1);

        return str;
    }

}