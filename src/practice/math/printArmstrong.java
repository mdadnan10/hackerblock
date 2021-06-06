package practice.math;

import java.util.Scanner;

public class printArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();
        printArmStrong(n, n1);

    }

    public static void printArmStrong(int n, int n1) {

        for (int i = n; i <= n1; i++) {

            int num = i;
            int temp = i;

            int digit = 0;

            while (temp > 0) {

                int rem = temp % 10;
                temp /= 10;
                digit++;

            }

            int res = 0;

            while (num > 0) {

                int rem = num % 10;
                res += (int) Math.pow(rem, digit);
                num /= 10;

            }

            if (res == i)
                System.out.println(res);

        }

    }

}
