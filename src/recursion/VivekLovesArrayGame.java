package recursion;

import java.util.Scanner;

public class VivekLovesArrayGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();
            System.out.println(maxScore(arr, 0, arr.length - 1));

        }
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void game(int[] arr, int vidx) {

        if (arr.length == vidx)
            return;

        int l = arr.length;
        int sum1 = 0;
        for (int i = 0; i < l / 2; i++)
            sum1 += arr[i];
        int sum2 = 0;
        for (int i = l / 2; i < l; i++)
            sum2 += arr[i];

        game(arr, vidx + 2);

        if (sum1 == sum2) System.out.println(1);
        else System.out.println(0);

    }

    public static int maxScore(int[] arr, int si, int ei) {

        if (si > ei) return 0;

        int fh = 0;
        int sh = 0;

        for (int i = si; i < ei; i++) {

            int sum1 = sum(arr, si, i);
            int sum2 = sum(arr, i + 1, ei);

            if (sum1 == sum2) {
                fh = maxScore(arr, si, i);
                sh = maxScore(arr, i + 1, ei);

                return Math.max(fh, sh) + 1;
            }
        }

        return 0;
    }

    public static int sum(int[] arr, int si, int ei) {

        int sum = 0;
        for (int i = si; i <= ei; i++)
            sum += arr[i];

        return sum;
    }

}
