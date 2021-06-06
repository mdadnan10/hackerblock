package math;

import java.util.Arrays;

public class SOE {
    public static void main(String[] args) {

        int n = 10;
        soe(n);

    }

    public static void soe(int n) {

        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int table = 2; table * table <= n; table++) {

            if (!primes[table])
                continue;

            for (int mult = 2; table * mult <= n; mult++)
                primes[table * mult] = false;

        }

        for (int i = 0; i < primes.length; i++)
            if (primes[i])
                System.out.println(i);

    }

}
