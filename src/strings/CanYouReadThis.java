package strings;

import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        subString(str);
    }

    public static void subString(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (i != 0 && str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                System.out.println();

            System.out.print(str.charAt(i));

        }

    }

}
