package practice.strings;

import java.util.Scanner;

public class StringRemoveDuplicateCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        removeDuplicate(str);

    }

    public static void removeDuplicate(String str) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) != str.charAt(i + 1))
                res.append(str.charAt(i));

        }

        res.append(str.charAt(str.length() - 1));

        System.out.println(res);

    }

}
