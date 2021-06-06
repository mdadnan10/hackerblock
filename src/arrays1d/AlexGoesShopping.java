package arrays1d;

import java.util.Scanner;

public class AlexGoesShopping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] itemPrice = takeInput();

        int q = sc.nextInt();

        for (int i = 1; i <= q; i++) {
            int money = sc.nextInt();
            int itemCanBuy = sc.nextInt();

            if (isQuery(itemPrice, itemPrice.length, money, itemCanBuy))
                System.out.println("Yes");

            else {
                System.out.println("No");
            }

        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] itemPrice = new int[n];

        for (int i = 0; i < n; i++)
            itemPrice[i] = sc.nextInt();

        return itemPrice;
    }

    public static boolean isQuery(int[] itemPrice, int n, int a, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a % itemPrice[i] == 0) {
                count++;
            }
        }
        return count >= k;
    }
}
