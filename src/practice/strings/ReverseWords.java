package practice.strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= tc; i++) {
            String str = sc.nextLine();
            reverse(str);
            System.out.println();
        }
//        reverseWords(str);

    }

    public static void reverseWords(String str) {

        for (int i = str.length(); i >= 0; i--) {

            for (int j = i - 1; j >= 0; j--) {

                if (str.charAt(j) == ' ')
                    System.out.print(str.substring(j, i));

            }

        }

    }

    public static void reverse(String str) {

        String[] arr = str.split(" ");

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");

    }

}
