package math;

import java.math.BigInteger;

public class BigIntegerMultiply {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(10);
        BigInteger b = BigInteger.valueOf(10);

        BigInteger res = a.multiply(b);
        BigInteger add = a.add(b);
        BigInteger mod = a.mod(b);

        System.out.println(mod);

        System.out.println(res);
    }
}
