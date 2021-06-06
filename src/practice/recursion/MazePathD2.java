package practice.recursion;

import java.util.Scanner;

public class MazePathD2 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        mazePathD2(0, n - 1, 0, n - 1, "");
        System.out.println();
        System.out.println(count);

    }

    public static void mazePathD2(int cr, int er, int cc, int ec, String ans) {

        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        if (cr > er || cc > ec) return;

        mazePathD2(cr + 1, er, cc, ec, ans + "V");
        mazePathD2(cr, er, cc + 1, ec, ans + "H");
        if (cr == cc || cr + cc == ec)
            mazePathD2(cr + 1, er, cc + 1, ec, ans + "D");

    }

}
