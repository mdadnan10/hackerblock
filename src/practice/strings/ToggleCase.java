package practice.strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        toggle(str);

    }

    public static void toggle(String str) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                res.append(Character.toLowerCase(str.charAt(i)));
            }
            else res.append(Character.toUpperCase(str.charAt(i)));

        }

        System.out.println(res);

    }

}
