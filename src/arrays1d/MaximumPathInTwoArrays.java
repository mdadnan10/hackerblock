package arrays1d;

import java.util.Scanner;

public class MaximumPathInTwoArrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        takeInput();

    }

    public static void takeInput() {

        MaximumSumPath sumPath = new MaximumSumPath();

        int tc = sc.nextInt();

        for (int j = 1; j <= tc; j++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++)
                arr1[i] = sc.nextInt();

            for (int i = 0; i < n; i++)
                arr2[i] = sc.nextInt();

            int x = arr1.length;
            int y = arr2.length;
            System.out.println(sumPath.maxPathSum(arr1, arr2, x, y));
        }
    }

    public static class MaximumSumPath {

        int max(int x, int y) {
            return Math.max(x, y);
        }

        int maxPathSum(int[] ar1, int[] ar2, int m, int n) {

            int i = 0, j = 0;

            int result = 0, sum1 = 0, sum2 = 0;

            while (i < m && j < n) {
                if (ar1[i] < ar2[j])
                    sum1 += ar1[i++];

                else if (ar1[i] > ar2[j])
                    sum2 += ar2[j++];

                else {
                    result += max(sum1, sum2);

                    sum1 = 0;
                    sum2 = 0;

                    int temp = i;
                    while (i < m && ar1[i] == ar2[j])
                        sum1 += ar1[i++];

                    while (j < n && ar1[temp] == ar2[j])
                        sum2 += ar2[j++];

                    result += max(sum1, sum2);

                    sum1 = 0;
                    sum2 = 0;
                }
            }

            while (i < m)
                sum1 += ar1[i++];

            while (j < n)
                sum2 += ar2[j++];

            result += max(sum1, sum2);

            return result;
        }

    }

}
