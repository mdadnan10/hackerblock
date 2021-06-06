package practice.math;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("Prime");
        else System.out.println("Not Prime");

    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
