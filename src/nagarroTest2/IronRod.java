package nagarroTest2;

public class IronRod {
    public static void main(String[] args) {

        int[] price = {0, 2, 1, 7, 3, 5};
        int len = 5;
        System.out.println(maxProfit(price, len));
        System.out.println(maxProfitBup(price, len));

    }

    public static int maxProfit(int[] price, int len){

        if (len <= 0){
            return 0;
        }

        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i <= len; i++){

            int profit = price[i] + maxProfit(price, len -  i);

            if (profit > maxProfit)
                maxProfit = profit;

        }

        return maxProfit;
    }

    // tc : O(n^2) | sc : array of len + 1 size
    public static int maxProfitBup(int[] price, int len){

        int[] storage = new int[len + 1];

        for (int i = 1; i <= len; i++){

            int maxProfit = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++){

                maxProfit = Math.max(maxProfit, price[j] + storage[i - j]);

            }

            storage[i] = maxProfit;
        }

        return storage[len];
    }

}
