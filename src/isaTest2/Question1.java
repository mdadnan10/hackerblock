package isaTest2;

import java.util.Scanner;

public class Question1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = takeInput(n);

    }

    public static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    static long c;

    static boolean is_Answer(long[] arr, long n, long ans) {
        int ca = 1;
        long prev = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - prev >= ans) {
                prev = arr[i];
                ca++;
                if (ca == c)
                    return true;
            }
        }

        return ca >= c;
    }


}
