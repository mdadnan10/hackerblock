package practice.recursion;

import java.util.Scanner;

public class CoinChangeH {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args) {

        int target = sc.nextInt();
        int[] coins = takeInput();
        coinChange(coins, 0, target);
        System.out.println(count);

    }

    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void coinChange(int[] arr, int vidx, int target){

        if (target == 0){
            count++;
            return;
        }

        for (int i = vidx; i < arr.length; i++)
            if (arr[i] <= target)
                coinChange(arr, i, target - arr[i]);

    }

}
