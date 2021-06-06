package practice.array.arrays1D;

import java.util.Scanner;

public class CalculateTheSum {
    static int mod = 1_000_000_007;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr = takeInput(n);
        int q = sc.nextInt();
        calculateSum(arr, n, q);


    }

    public static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void calculateSum(int[] arr, int n, int q) {

        while (q > 0) {

            int x = sc.nextInt();
            if (x == 0) {
                for (int i = 0; i < arr.length; i++)
                    arr[i] = 2 * arr[i];

            } else {
                int[] temp = new int[n];

                temp[x] = arr[x] + arr[0];
                int j = x - 1;

                while (j != x) {

                    int idx = j - x;

                    if (idx < 0)
                        idx = idx + n;

                    temp[j] = arr[j] + arr[idx];

                    j--;
                    if (j < 0)
                        j = n - 1;
                }
                arr = temp;
            }

            q--;
        }

        long sum = 0;
        for (int j : arr)
            sum = (sum + j) % mod;

        System.out.println(sum);

    }

}