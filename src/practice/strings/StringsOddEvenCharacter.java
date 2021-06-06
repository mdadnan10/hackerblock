package practice.strings;

import java.util.Scanner;

public class StringsOddEvenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        oddEven(str);

    }

    public static void oddEven(String str) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if ((i + 1) % 2 == 0)
                ans.append((char) (str.charAt(i) - 1));
            else
                ans.append((char) (str.charAt(i) + 1));

        }

        System.out.println(ans);

    }

}
