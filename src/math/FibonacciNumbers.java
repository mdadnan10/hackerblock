package math;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        printFibonacci(1);

    }

    public static void printFibonacci(long n) {

        long a = 0;
        long b = 1;
        long sum = 0;

        while (a <= n) {

            sum = a + b;
            System.out.println(a);
            a = b;
            b = sum;

        }

    }

}
