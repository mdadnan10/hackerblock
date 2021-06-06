package practice.math;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long res = 0;

        for (long i = 5; i <= n; i *= 5)
            res = res + n / i;

        System.out.println(res);
    }
}
