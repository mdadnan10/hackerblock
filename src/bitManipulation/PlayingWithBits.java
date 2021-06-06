package bitManipulation;

import java.util.Scanner;

public class PlayingWithBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            count(a, b);
        }

    }

    public static void count(int a, int b){

        int count = 0;

        for (int i = a; i <= b; i++){

            int num = i;

            while (num != 0){

                if ((num & 1) == 1) {
                    count++;
                }

                num = num >> 1;
            }

        }

        System.out.println(count);
    }

}
