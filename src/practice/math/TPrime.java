package practice.math;

import java.util.Scanner;

public class TPrime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        long[] arr = takeInput();
        tPrime(arr);

    }

    public static long[] takeInput() {

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        return arr;
    }

    public static void tPrime(long[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (prime(arr[i]) == 3) System.out.println("YES");
            else System.out.println("NO");

        }

    }

    public static long prime(long n) {

        long count = 0;

        for (long i = 1; i <= n; i++) {

            if (n % i == 0) count++;

        }

        return count;
    }

}
