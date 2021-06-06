package isaTest2;

import java.util.Scanner;

public class Question5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int par = sc.nextInt();
        int cooks = sc.nextInt();
        int[] ranks = takeInput(cooks);
        System.out.println(calc(par, cooks, ranks));

    }

    public static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int time(int rank, int par) {

        return (par * (par + 1) / 2) * rank;

    }

    public static boolean minTime(int par, int cooks, int[] ranks, int m) {

        int j = 0;
        int tm = 0;
        int i = 0;

        while (par >= 0) {

            if (time(ranks[j], i) <= m) {
                i++;
                par--;
            } else {
                j++;
                if (j == cooks)
                    return false;
                i = 1;
                tm = 0;
            }

        }

        return true;
    }

    public static int calc(int par, int cooks, int[] rank) {

        int s = time(rank[0], 1);
        int e = time(rank[cooks - 1], par);
        int ans = 0;

        while (s <= e) {

            int m = (s + e) / 2;
            if (minTime(par, cooks, rank, m)) {

                ans = m;
                e = m - 1;

            } else s = m + 1;

        }

        return ans;
    }
}
