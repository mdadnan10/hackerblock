package arrays1d;

import java.util.*;

public class MaximumSumPath {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] one = new int[n];
            int[] two = new int[m];
            takeInput(one);
            takeInput(two);

            int res = maxSum(one, two, n, m);
            System.out.println(res);
        }

    }

    public static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }

    public static int maxSum(int[] one, int[] two, int m, int n) {

        int i = 0;
        int j = 0;

        int sum1 = 0;
        int sum2 = 0;

        int result = 0;

        while (i < m && j < n) {
            if (one[i] < two[j])
                sum1 += one[i++];

            else if (one[i] > two[j])
                sum2 += two[j++];

            else  // Found a common point
            {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;

                while (i < m && j < n && one[i] == two[j]) {
                    result = result + one[i];
                    i++;
                    j++;
                }
            }
        }

        while (i < m)
            sum1 += one[i++];
        while (j < n)
            sum2 += two[j++];

        result += Math.max(sum1, sum2);

        return result;
    }
}
