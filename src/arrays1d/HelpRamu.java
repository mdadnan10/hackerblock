package arrays1d;

import java.util.Scanner;

public class HelpRamu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
        int[] price = takeInput();
        minSpend(price);
        }

    }

    public static int[] takeInput() {

        int[] price = new int[4];

        for (int i = 0; i < price.length; i++)
            price[i] = sc.nextInt();

        return price;
    }

    public static void minSpend(int[] price) {

        int noOfRickshaw = sc.nextInt();
        int noOfCab = sc.nextInt();

        int[] trips = new int[noOfRickshaw];
        for (int r = 0; r < noOfRickshaw; r++) {
            trips[r] = sc.nextInt();
        }

        int[] cabs = new int[noOfCab];
        for (int c = 0; c < noOfCab; c++) {
            cabs[c] = sc.nextInt();
        }

        // deal rickshaw
        int priceOfDeal3 = 0;
        int[] minRickshaws = new int[noOfRickshaw];
        for (int i = 0; i < noOfRickshaw; i++)
            minRickshaws[i] = Integer.MAX_VALUE;

        // deal cab
        int cabDeal3 = 0;
        int[] minCabs = new int[noOfCab];
        for (int i = 0; i < noOfCab; i++) {
            minCabs[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < price.length - 1; i++) {

            // deal 1
            if (i == 0) {

                // rickshaw
                for (int r = 0; r < noOfRickshaw; r++) {

                    int d1r = trips[r] * price[i];

                    if (d1r < minRickshaws[r])
                        minRickshaws[r] = d1r;

                }

                // cabs
                for (int c = 0; c < noOfCab; c++) {

                    int d1c = cabs[c] * price[i];

                    if (d1c < minCabs[c])
                        minCabs[c] = d1c;

                }
            }

            // deal 2
            else if (i == 1) {

                // rickshaw
                for (int r = 0; r < noOfRickshaw; r++) {

                    int d1r = price[i];

                    if (d1r < minRickshaws[r])
                        minRickshaws[r] = d1r;
                }

                // cabs
                for (int c = 0; c < noOfCab; c++) {

                    int d1c = price[i];

                    if (d1c < minCabs[c])
                        minCabs[c] = d1c;

                }
            }

            // deal 3
            else if (i == 2) {

                priceOfDeal3 = price[i];
                cabDeal3 = price[i];

            }

        }

        int ricFirstPrice = 0;
        for (int val : minRickshaws)
            ricFirstPrice += val;


        int cabFirstPrice = 0;
        for (int val : minCabs)
            cabFirstPrice += val;

        int rickshawPrice = Math.min(ricFirstPrice, priceOfDeal3);
        int cabPrice = Math.min(cabFirstPrice, cabDeal3);

        int priceSpend = rickshawPrice + cabPrice;

        int minCostSpend = Math.min(priceSpend, price[3]);

        System.out.println(minCostSpend);

    }

}
