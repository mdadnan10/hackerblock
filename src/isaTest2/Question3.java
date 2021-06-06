package isaTest2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++){
            int n = sc.nextInt();
            System.out.println(minSteps(n));
        }

    }
    public static int minSteps(int n) {

        if ((n & (n - 1)) == 1)
            return 1;

        int sum = 0;
        int mask = n;
        while (mask != 0) {

            sum += mask & 1;
            mask >>= 1;

        }

        return sum;
    }
}
