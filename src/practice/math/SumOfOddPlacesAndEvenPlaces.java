package practice.math;

import java.util.Scanner;

public class SumOfOddPlacesAndEvenPlaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);

    }

    public static void sum(int n) {

        int temp = n;

        int count = 1;
        int evenSum = 0;
        int oddSum = 0;

        while (temp > 0) {

            int rem = temp % 10;

            if (count % 2 == 0)
                evenSum += rem;
            else oddSum += rem;

            count++;
            temp /= 10;

        }

        System.out.println(oddSum);
        System.out.println(evenSum);

    }

}
