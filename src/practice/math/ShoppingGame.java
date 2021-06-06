package practice.math;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int aayush = sc.nextInt();
            int harshit = sc.nextInt();
            shop(aayush, harshit);
        }

    }

    public static void shop(int a, int h) {

        int ayush = 0;
        int harshit = 0;

        int max = Math.max(a, h);

        int i = 1;
        int j = 2;

        int c = 1;
        while (c <= max) {

            if (ayush <= a) {
                ayush += i;
                i += 2;
            }

            if (harshit <= h) {
                harshit += j;
                j += 2;
            }

            c++;
        }

        System.out.println(ayush);
        System.out.println(harshit);

        if (ayush > harshit)
            System.out.println("Aayush");
        else System.out.println("Harshit");


    }

}
