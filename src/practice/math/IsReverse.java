package practice.math;

import java.util.Scanner;

public class IsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();

        System.out.println(isReverse(n, n1));

    }

    public static boolean isReverse(int n, int n1){

        int reverse = 0;

        while (n > 0){

            int rem = n % 10;

            reverse = reverse * 10 + rem;

            n /= 10;
        }

        return reverse == n1;
    }

}
