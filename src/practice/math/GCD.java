package practice.math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));

    }

//    public static void gcd1(int n, int n1) {
//
//        int min = Math.min(n, n1);
//        int gcd = 1;
//
//        for (int i = 2; i <= min; i++) {
//
//            if (n % i == 0 && n1 % i == 0)
//                gcd = i;
//
//        }
//
//        System.out.println(gcd);
//
//    }
//
//    public static void gcd(int n, int n1) {
//
//        int min = Math.min(n, n1);
//
//        int gcd = 1;
//
//        for (int i = 2; i <= min; i++) {
//
//            if (n % i == 0 && n1 % i == 0) {
//                gcd = i;
//            }
//
//        }
//
//        System.out.println(gcd);
//    }

    public static int gcd(int n, int n1) {

        int min = Math.min(n, n1);
        int gcd = 1;

        for (int i = 2; i <= min; i++)
            if (n % i == 0 && n1 % i == 0)
                gcd = i;


        return gcd;
    }

}
