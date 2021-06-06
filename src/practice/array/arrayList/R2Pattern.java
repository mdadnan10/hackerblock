package practice.array.arrayList;

import java.util.Scanner;

public class R2Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        r2(n);

    }

    public static void r2(int n) {

        if (n == 0) return;

        if (n % 2 != 0)
            System.out.println(n);
        System.out.println();

        r2(n - 1);

        if (n % 2 == 0)
            System.out.println(n);
        System.out.println();

    }

}