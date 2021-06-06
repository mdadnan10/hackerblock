package practice.math;

import java.util.Scanner;

public class IsArmStrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmStrong(n));

    }

    public static boolean isArmStrong(int n) {

        int temp = n;
        int check = n;
        int count = 0;

        while (temp > 0) {

            int rem = temp % 10;
            temp /= 10;
            count++;

        }

        int res = 0;

        while (check > 0) {

            int rem = check % 10;
            res += (int) Math.pow(rem, count);
            check /= 10;

        }

        return res == n;

    }

}
