package practice.math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println(palindrome(i));

        String str = sc.nextLine();
        System.out.println(stringPalindrome(str));

    }

    public static boolean palindrome(int n) {

        int temp = n;
        int res = 0;

        while (temp > 0) {

            int rem = temp % 10;
            res = res * 10 + rem;
            temp /= 10;
        }

        return n == res;
    }

    public static boolean stringPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

}
