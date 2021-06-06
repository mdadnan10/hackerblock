package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        tower(n, 'A', 'B', 'C');
        int n = 2;
        towerOfHanoi(n, '1', '2', '3');


    }

    public static void tower(int n, char from, char to, char mid) {

        if (n == 1) {
            System.out.println("Moving ring " + n + " from " + from + " to " + to);
            return;
        }

        tower(n - 1, from, mid, to);
        System.out.println("Moving ring " + n + " from " + to + " to " + from);
        tower(n - 1, mid, to, from);

    }

    public static void towerOfHanoi(int n, char from, char to, char mid) {

        if (n == 1) {
            System.out.println("Move " + n + "th disc from T" + from + " to T" + to);
            count++;
            return;
        }

        towerOfHanoi(n - 1, from, mid, to);
        System.out.println("Move " + n + "th disc from T" + from + " to T" + to);
        count++;
        towerOfHanoi(n - 1, mid, to, from);

    }

}