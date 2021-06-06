package practice.recursion;

public class CoinChangeCoinRespect {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int amount = 5;
        coinChangeCoin(arr, amount, "");

    }

    public static void coinChangeCoin(int[] arr, int amount, String ans) {

        if (amount == 0) {
            System.out.println(ans);
            return;
        }

        if (amount < 0) return;

        for (int i : arr)
            coinChangeCoin(arr, amount - i, ans + i);

    }

}
