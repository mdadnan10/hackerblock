package recursion;

import java.util.Scanner;

public class MazePathD {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int er = sc.nextInt();
        int ec = sc.nextInt();

        mazePath(1, 1, er, ec, "");
        System.out.println();

        System.out.println(count);

    }

    public static void mazePath(int cr, int cc, int er, int ec, String ans) {

        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        if (cr > er || cc > ec) return;


        mazePath(cr + 1, cc, er, ec, ans + "V");
        mazePath(cr, cc + 1, er, ec, ans + "H");
        mazePath(cr + 1, cc + 1, er, ec,ans + "D");

    }

}
