package practice.recursion;

import java.util.Scanner;

public class R4Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        r4Pattern(n);
    }

    public static void r4Pattern(int n) {

        if (n == 0) return;

        r4Pattern(n - 1);

        for (int i = 1; i <= n; i++) {
                System.out.print("*");
        }
        System.out.println();

    }

}
