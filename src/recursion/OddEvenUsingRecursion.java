package recursion;

import java.util.Scanner;

public class OddEvenUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        oddEven(n);

    }

    public static void oddEven(int n) {

        if (n == 0) return;

        if (n % 2 != 0)
            System.out.println(n);

        oddEven(n - 1);

        if (n % 2 == 0)
            System.out.println(n);
    }

}
