package strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(toggleCase(str));

    }

    public static String toggleCase(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLowerCase(str.charAt(i))) {
                res += Character.toUpperCase(str.charAt(i));
            } else {
                res += Character.toLowerCase(str.charAt(i));
            }
        }

        return res;
    }

}
