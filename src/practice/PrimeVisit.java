package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeVisit {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        int s = 10;
        int e = 10;
//        totalVisit(s, e);

    }

    public static void totalVisit(int s, int e) {

        boolean[] primes = new boolean[e + 1];
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for (int table = 2; table * table <= e; table++) {

            if (!primes[table])
                continue;

            for (int mult = 2; table * mult <= e; mult++) {
                primes[table * mult] = false;
            }

        }

        for (int i = 0; i < primes.length; i++) {
            if (primes[i])
            System.out.println(i);
        }

    }

}
