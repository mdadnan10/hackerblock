package recursion;

import java.util.Scanner;

public class BoardPath {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        boardPath(n, m, 0,"");
        System.out.println();
        System.out.println(count);

    }

    public static void boardPath(int n, int m, int present, String ans){

        if (present == n){
            System.out.print(ans + " ");
            count++;
            return;
        }

        if (present > n) return;

        for (int i = 1; i <= m; i++)
            boardPath(n, m, present + i, ans + i);

    }

}
