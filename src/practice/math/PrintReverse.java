package practice.math;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        reverse(n);

    }

    public static void reverse(long n){

        long ans = 0;

        while (n > 0){

            long rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;

        }

        System.out.println(ans);

    }

}
