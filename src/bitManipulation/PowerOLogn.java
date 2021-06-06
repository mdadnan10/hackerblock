package bitManipulation;

import java.util.Scanner;

public class PowerOLogn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        int power = n << (p - 1);

        System.out.println(power);
    }
}
