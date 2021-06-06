package practice.strings;

import java.util.Scanner;

public class StringMaxFrequencyCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        maxFrequency(str);

    }

    public static void maxFrequency(String str) {

        int[] chars = new int[256];

        for (int i = 0; i < str.length(); i++) {

            chars[str.charAt(i)] += 1;

        }

        int max = chars[0];
        int maxChar = 0;

        for (int i = 1; i < chars.length; i++)
            if (chars[i] > max) {
                max = chars[i];
                maxChar = i;
            }

        System.out.println((char) maxChar);

    }

}
