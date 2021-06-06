package practice.math;

import java.util.Scanner;

public class NobitaScoredGoodMarks {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//
//        for (int i = 1; i <= tc; i++) {
//
//            int x = sc.nextInt();
//            int n = sc.nextInt();
//            distribute(x, n);
//
//        }

        distribute(11, 3);

    }

    public static void distribute(int x, int friends) {

        int canReturn = x % friends;

        int heWill = Math.min(friends - canReturn, canReturn);

        System.out.println(heWill);

    }

}
