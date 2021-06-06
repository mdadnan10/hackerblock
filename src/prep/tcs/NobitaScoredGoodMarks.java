package prep.tcs;

import java.util.Scanner;

public class NobitaScoredGoodMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int chocolate = sc.nextInt();
            int friends = sc.nextInt();

            scoredGoodMarks(chocolate, friends);
        }
    }

    public static void scoredGoodMarks(int x, int friends) {

        int remAfterDistribute = x % friends;

        int heWill = Math.min(friends - remAfterDistribute, remAfterDistribute);

        System.out.println(heWill);

    }

}
