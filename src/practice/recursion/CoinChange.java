package practice.recursion;

public class CoinChange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        coinChange(arr, 5, "");

    }

    public static void coinChange(int[] arr, int target, String ans){

        if (target == 0){
            System.out.println(ans);
            return;
        }

        if (target < 0) return;

        for (int i : arr)
            coinChange(arr, target - i, ans + i);

    }

}
