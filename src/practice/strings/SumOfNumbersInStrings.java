package practice.strings;

import java.util.Scanner;

public class SumOfNumbersInStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            String str = "1abc23";
            sumInStrings(str);
        }

    }

    public static void sumInStrings(String str) {

        long sum = 0;
        StringBuilder num = new StringBuilder("0");

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
            } else {
                sum += Long.parseLong(String.valueOf(num));
                num = new StringBuilder("0");
            }

        }

        if (num.length() > 0) sum += Long.parseLong(String.valueOf(num));

        System.out.println(sum);
    }

}
