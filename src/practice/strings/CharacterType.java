package practice.strings;

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        characterType(ch);

    }

    public static void characterType(char ch) {

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

            if (Character.isUpperCase(ch))
                System.out.println("U");
            else System.out.println("L");

        } else System.out.println("I");

    }

}
