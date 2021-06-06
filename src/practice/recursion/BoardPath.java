package practice.recursion;

import java.util.Scanner;

public class BoardPath {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int board = sc.nextInt();
        int dice = sc.nextInt();
        boardPath(board, dice, 0, "");
        System.out.println();
        System.out.println(count);

    }

    public static void boardPath(int board, int dice, int sum, String ans) {

        if (board == sum) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        if (sum > board) return;

        for (int i = 1; i <= dice; i++)
            boardPath(board, dice, sum + i, ans + i);
    }

}
