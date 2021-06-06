package practice.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPrime(n);

    }

    public static void printPrime(int n) {

        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int table = 2; table * table < primes.length; table++) {

            if (!(primes[table])) continue;

            for (int mult = 2; table * mult < primes.length; mult++)
                primes[table * mult] = false;

        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < primes.length; i++)
            if (primes[i]) res.add(i);

        for (int i = 0; i < res.size(); i++)
            if (i == res.size()-1)
                System.out.print(res.get(i));
            else System.out.print(res.get(i) + ", ");
    }

}
