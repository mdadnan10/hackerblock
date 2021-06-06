package practice.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeepakAndPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        soe(n);

    }

    public static void soe(int n) {

        boolean[] primes = new boolean[10000];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int table = 2; table * table < primes.length; table++) {

            if (!primes[table]) continue;

            for (int mult = 2; table * mult < primes.length; mult++)
                primes[table * mult] = false;

        }

        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 0; i < primes.length; i++)
            if (primes[i]) prime.add(i);

        System.out.println(prime.get(n - 1));
    }

}
