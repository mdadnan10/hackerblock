package practice.math;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        chewbacca(n);

    }

    public static long reverse(long n) {

        long ans = 0;

        while (n > 0) {

            long rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;

        }

        return ans;
    }

    public static void chewbacca(long n) {

        long temp = reverse(n);
        long ans = 0;
        int count = 0;

        while (temp > 0) {

            long rem = temp % 10;

            if (count == 0 && rem == 9)
                rem = rem;
            else {
                long invert = 9 - rem;

                if (invert < rem)
                    rem = invert;
            }

            ans = ans * 10 + rem;

            temp /= 10;
            count += 1;
        }

        System.out.println(ans);

    }

}
