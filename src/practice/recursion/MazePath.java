package practice.recursion;

import java.util.Scanner;

public class MazePath {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        mazePath(0, m - 1, 0, n - 1, "");
        System.out.println();
        System.out.println(count);

    }

    public static void mazePath(int cr, int er, int cc, int ec, String ans) {

        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        if (cr > er || cc > ec) return;

        mazePath(cr + 1, er, cc, ec, ans + "V");
        mazePath(cr, er, cc + 1, ec, ans + "H");
        mazePath(cr + 1, er, cc + 1, ec, ans + "D");

    }

}
