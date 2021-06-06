package practice.math;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        replaceThemAll(n);

    }

    public static void replaceThemAll(long n) {

        if (n == 0)
            System.out.println(5);

        long temp = n;
        long res = 0;
        int mult = 1;

        while (temp > 0) {

            long rem = temp % 10;

            if (rem == 0)
                rem = 5;

            res = rem * mult + res;

            mult = mult * 10;
            temp /= 10;

        }

        System.out.println(res);

    }

}
