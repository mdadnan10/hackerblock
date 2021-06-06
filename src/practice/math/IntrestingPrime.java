package practice.math;

import java.util.Arrays;
import java.util.Scanner;

public class IntrestingPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeGenerator(n);

    }

    public static void primeGenerator(int n) {

        boolean[] primes = new boolean[100000];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int table = 2; table * table < 100000; table++) {

            if (!primes[table]) continue;

            for (int mult = 2; table * mult < 100000; mult++)
                primes[table * mult] = false;

        }

        int count = 0;

        for (int i = 0; i < primes.length; i++) {

            if (primes[i]) {

                if (i == n) {
                    count += 1;
                }

            }

        }
        System.out.println(count);
    }
}
