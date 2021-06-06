package practice.math;

import java.math.BigInteger;
import java.util.Scanner;

public class FactoSum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        long n = sc.nextInt();
//        factoSum(n);
        fact(20);

    }

    public static void factoSum(long n) {

        BigInteger totalSum = BigInteger.ZERO;

        for (long i = 1; i <= n; i++) {

            long num = sc.nextLong();
            long fact = 1;

            for (long j = 1; j <= num; j++)
                fact *= j;

            totalSum = totalSum.add(BigInteger.valueOf(fact));

        }

        BigInteger mod = new BigInteger("107");
        BigInteger val = totalSum.mod(mod);
        System.out.println(val);

    }

    public static void fact(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(fact + " * " + i);
            fact *= i;
        }

        System.out.println(fact);

    }

}
