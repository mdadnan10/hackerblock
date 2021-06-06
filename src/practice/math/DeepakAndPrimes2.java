package practice.math;

import java.util.Arrays;
import java.util.Scanner;

public class DeepakAndPrimes2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int n = sc.nextInt();
            int n1 = sc.nextInt();
            soe(n, n1);
            System.out.println();

        }

    }

    public static void soe(int n, int n1) {

        boolean[] primes = new boolean[n1 + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int table = 2; table * table <= n1; table++) {

            if (!primes[table]) continue;

            for (int mult = 2; table * mult <= n1; mult++)
                primes[table * mult] = false;

        }

        for (int i = n; i < primes.length; i++)
            if (primes[i]) System.out.println(i);

    }

}
