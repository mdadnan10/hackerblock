package practice.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MartinAndTheMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int t = 1; t <= tc; t++) {

        int n = sc.nextInt();

        ArrayList<Integer> res = primeNumber(n);
        ArrayList<Integer> product = new ArrayList<>();

        for (int i = 0; i < res.size() - 1; i++) {

            for (int j = i + 1; j < res.size(); j++)
                if (res.get(i) * res.get(j) < n)
                    product.add(res.get(i) * res.get(j));

        }

        Collections.sort(product);

        for (int val : product)
            System.out.print(val + " ");
            System.out.println();

        }

    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static ArrayList<Integer> primeNumber(int n) {

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {

            if (isPrime(i))
                primeNumbers.add(i);

        }

        return primeNumbers;
    }

}
