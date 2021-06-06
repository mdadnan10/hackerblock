package bitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int n = sc.nextInt();
            countSetBits(n);
        }

    }

    public static void countSetBits(int n){

        int count = 0;

        while (n != 0){

            if ((n & 1) == 1)
                count++;

            n = n >> 1;
        }

        System.out.println(count);
    }

}
