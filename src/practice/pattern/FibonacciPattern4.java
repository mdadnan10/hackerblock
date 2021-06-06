package practice.pattern;

import java.util.Scanner;

public class FibonacciPattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternFibonacci(n);

    }

    public static void patternFibonacci(int n) {

        int a = 0;
        int b = 1;

        for (int row = 1; row <= n; row++) {

            // fibonacci
            for (int col = 1; col <= row; col++) {
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }

            //update
            System.out.println();

        }

    }

}
