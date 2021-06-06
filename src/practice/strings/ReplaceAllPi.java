package practice.strings;

import java.util.Scanner;

public class ReplaceAllPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= tc; i++) {

            String str = sc.nextLine();
            replace(str);

        }

    }

    public static void replace(String str) {

        str = str.replace("pi", "3.14");

        System.out.println(str);

    }

}
