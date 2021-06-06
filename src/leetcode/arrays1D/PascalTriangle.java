package leetcode.arrays1D;

import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

        int n = 5;
        pascalTriangle(n);

    }

    public static void pascalTriangle(int n) {

        for (int row = 0; row < n; row++) {

            long res = 1;

            for (int col = 1; col <= row; col++) {
                res *= 11;
            }

            System.out.println(res);

        }

    }

}
