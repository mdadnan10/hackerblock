package arrays1d;

import java.util.*;

public class CalculateTheSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ptr = new int[n];
        for (int i = 0; i < n; i++) {
            ptr[i] = a[i];
        }
        int op = sc.nextInt();
        while (op-- > 0) {
            int x = sc.nextInt();
            ptr = theSum(ptr, n, x);
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ptr[i];
            sum %= (1000000007);
        }
        System.out.println(sum);
    }

    public static int[] theSum(int[] a, int n, int x) {
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i - x;
            if (j >= 0) {
                out[i] = a[i] + a[i - x];
            } else {
                out[i] = a[i] + a[n - x + i];
            }
        }
        return out;
    }
}
