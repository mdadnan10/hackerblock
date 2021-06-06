package practice.recursion;

public class CoinChangeUserRespect {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5};
        int amount = 8;
        userRespect(arr, 0, amount, "");

    }

    public static void userRespect(int[] arr, int vidx, int amount, String ans) {

        if (amount == 0) {
            System.out.println(ans);
            return;
        }

        if (amount < 0) return;

        for (int i = vidx; i < arr.length; i++)
            userRespect(arr, i, amount - arr[i], ans + arr[i]);
    }

}
