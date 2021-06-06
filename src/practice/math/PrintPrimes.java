package practice.math;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);

    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void printPrime(int n){

        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                System.out.println(i);

    }

}
