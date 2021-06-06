package practice.math;

import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialOfALargeNumber {
    public static void main(String[] args) {

        int n = 16;


        ArrayList<Integer> res = new ArrayList<>();
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {

            fact = fact.multiply(BigInteger.valueOf(i));

        }

        System.out.println(res);
        System.out.println(res.get(res.size() - 1));
    }
}
