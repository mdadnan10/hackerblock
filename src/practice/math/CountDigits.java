package practice.math;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int d = sc.nextInt();
        countDigit(n, d);

    }

    public static void countDigit(long n, int d) {

        int count = 0;

        while (n > 0) {

            long rem = n % 10;

            if (rem == d)
                count++;

            n /= 10;

        }

        System.out.println(count);

    }

}
