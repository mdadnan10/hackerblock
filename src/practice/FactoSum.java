package practice;

import java.util.Scanner;

public class FactoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;

        long n = sc.nextInt();
        for (long i = 1; i <= n; i++) {
            long num = sc.nextInt();
            long facto = facto(num);
            sum += facto;
            System.out.println(facto);
        }

        long res = sum % 107;

        System.out.println(res);

    }

    public static long facto(long num) {

        long fact = 1;
        if (num == 0) return 0;
        else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
        }

        return fact;
    }

}
