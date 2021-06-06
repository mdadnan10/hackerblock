package math;

import java.util.Scanner;

public class NobitaScoredGoodMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            nobita(x, n);
        }

    }

    public static void nobita(long x, long n) {

        long reminder = x % n;
        System.out.println(Math.min(n - reminder, reminder));

    }

}
