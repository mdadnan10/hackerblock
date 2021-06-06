package practice.strings;

import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        read(str);

    }

    public static void read(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (i != 0 && Character.isUpperCase(str.charAt(i)))
                System.out.println();

            System.out.print(str.charAt(i));

        }

    }

}
