package practice.math;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(lcm(n1, n2));
        lcm1(n1, n2);

    }

    public static int lcm(int n, int n1){

        int min = (int) Math.min(n, n1);
        int max = (int) Math.max(n, n1);

        for (int i = max; ; i += max){

            if (i % min == 0) return i;

        }

    }

    public static void lcm1(int n, int n1){

        int lcm = 1;

        int c = n * n1;

        for (int i = 1; i <= c; i++){

            if (i % n == 0 && i % n1 == 0) {
                lcm = i;
                break;
            }


        }

        System.out.println(lcm);

    }

}
