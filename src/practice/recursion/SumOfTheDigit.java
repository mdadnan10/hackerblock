package practice.recursion;

import java.util.Scanner;

public class SumOfTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(sumOfTheDigit(str, 0, 0));


    }

    public static int sumOfTheDigit(String ques, int sum, int vidx) {

        if (ques.length() == vidx) return sum;

        char ch = ques.charAt(vidx);
        int num = ch - '0';

        return sumOfTheDigit(ques, sum + num, vidx + 1);
    }

    public static int sumofdigit(int n) {

        if (n == 0)
            return 0;
        return (n % 10 + sumofdigit(n / 10));
    }
}
