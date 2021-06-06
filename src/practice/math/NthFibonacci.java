package practice.math;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fibonacci(n);

    }

    public static void fibonacci(int n) {

        int a = 0;
        int b = 1;

        int sum = 0;

        for (int i = 1; i < n; i++) {

            sum = a + b;
            a = b;
            b = sum;

        }

        System.out.println(sum);

    }

}
