package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {

        int[] arr = takeInput();
        Arrays.sort(arr);
        count(arr, "", "", 0, 0, 0);
        System.out.println(count);
        splitArray(arr, "", "", 0, 0, 0);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void count(int[] arr, String ans1, String ans2, int sum1, int sum2, int vidx) {

        if (arr.length == vidx) {
            if (sum1 == sum2) {
                count++;
            }
            return;
        }

        count(arr, ans1 + arr[vidx] + " ", ans2, sum1 + arr[vidx], sum2, vidx + 1);
        count(arr, ans1, ans2 + arr[vidx] + " ", sum1, sum2 + arr[vidx], vidx + 1);

    }

    public static void splitArray(int[] arr, String ans1, String ans2, int sum1, int sum2, int vidx) {

        if (arr.length == vidx) {
            if (sum1 == sum2) {
                System.out.println(ans1 + "and " + ans2);
            }
            return;
        }

        splitArray(arr, ans1 + arr[vidx] + " ", ans2, sum1 + arr[vidx], sum2, vidx + 1);
        splitArray(arr, ans1, ans2 + arr[vidx] + " ", sum1, sum2 + arr[vidx], vidx + 1);

    }

}
