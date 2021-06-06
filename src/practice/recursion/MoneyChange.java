package practice.recursion;

import java.util.Scanner;

public class MoneyChange {
    static Scanner sc = new Scanner(System.in);
    static int mod = 1_000_000_007;

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] coin = takeInput();
            int money = sc.nextInt();

            int count = moneyChange(coin, 0, money, 0);

            int res = count % mod;
            System.out.println(res);

        }
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int moneyChange(int[] coin, int vidx, int target, int count) {

        if (target == 0) {
            count++;
            return count;
        }

        for (int i = vidx; i < coin.length; i++)
            if (target >= coin[i])
            count = moneyChange(coin, i, target - coin[i], count);

        return count;
    }

}
