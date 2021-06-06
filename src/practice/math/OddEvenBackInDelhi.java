package practice.math;

import java.util.Scanner;

public class OddEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int n = sc.nextInt();
            oddEven(n);
        }

    }

    public static void oddEven(int n) {

        int odd = 0;
        int even = 0;

        while (n > 0) {

            int rem = n % 10;

            if (rem % 2 == 0)
                even += rem;
            else odd += rem;

            n /= 10;

        }

        if (odd % 3 == 0 || even % 4 == 0)
            System.out.println("Yes");
        else System.out.println("No");

    }

}
