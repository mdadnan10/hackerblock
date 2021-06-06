package strings;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        lowerUpper(ch);

    }

    public static void lowerUpper(char ch) {

        if ((ch >= 65 && ch <= 90) || (ch >= 97) && (ch <= 122)) {

            if (Character.isLowerCase(ch))
                System.out.println("lowercase");
            else
                System.out.println("UPPERCASE");

        } else {
            System.out.println("Invalid");
        }

    }

}
