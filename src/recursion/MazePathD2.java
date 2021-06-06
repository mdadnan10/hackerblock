package recursion;

import java.util.Scanner;

public class MazePathD2 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        mazePath2(0, 0, n - 1, n - 1, "");
        System.out.println();
        System.out.println(count);

    }

    public static void mazePath2(int cr, int cc, int er, int ec, String ans) {

        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        if (cr > er || cc > ec) return;

        mazePath2(cr + 1, cc, er, ec, ans + "V");
        mazePath2(cr, cc + 1, er, ec, ans + "H");
        if (cr == cc || cr + cc == er)
            mazePath2(cr + 1, cc + 1, er, ec, ans + "D");

    }

}
