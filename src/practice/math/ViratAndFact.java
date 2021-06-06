package practice.math;

import java.math.BigInteger;
import java.util.Scanner;

public class ViratAndFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        viratFact(sc.nextInt());


    }

    public static void viratFact(int n){

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        System.out.println(fact);
    }

}
