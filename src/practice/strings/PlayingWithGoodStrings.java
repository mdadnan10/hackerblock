package practice.strings;

import java.util.Scanner;

public class PlayingWithGoodStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aabbccaeioubbcc";
        goodString(str);

    }

    public static void goodString(String str) {

        int max = 0;
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                count++;
                max = Math.max(count, max);

            } else count = 0;

        }

        System.out.println(max);

    }

}
