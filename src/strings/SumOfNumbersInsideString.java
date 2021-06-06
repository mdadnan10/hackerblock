package strings;

import java.util.Scanner;

public class SumOfNumbersInsideString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tc = Integer.parseInt(sc.nextLine());
//        for (int i = 1; i <= tc; i++) {
//            String str = sc.nextLine();
//            sum(str);
//        }
//
//    }
//
//    public static void sum(String str) {
//
//        Long count = 0L;
//        String temp = "0";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (Character.isDigit(str.charAt(i)))
//                temp += str.charAt(i);
//            else {
//                count += Long.parseLong(temp);
//                temp = "0";
//            }
//
//        }
//
//        count += Long.parseLong(temp);
//        System.out.println(count);
//    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = Integer.parseInt(scn.nextLine());
        while (i > 0) {
            String str = scn.nextLine();
            System.out.println(CalculateSum(str));
            i--;
        }
    }

    public static Long CalculateSum(String str) {
        String ans = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                sum += Long.parseLong(ans);
                ans = "0";
            } else {
                ans += ch;
            }
        }
        return sum + Long.parseLong(ans);
    }


}
