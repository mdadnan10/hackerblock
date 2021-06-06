package practice.recursion;

import java.util.Scanner;

public class SplitArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 3, 4, 5};
//        split(arr, 0, "", "", 0, 0);

        int[] arr = takeInput();
        int count = splitArray(arr, 0, "", "", 0, 0);
        System.out.println(count);

    }

    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void split(int[] arr, int vidx, String lAns, String rAns, int lSum, int rSum) {

        if (arr.length == vidx) {
            if (lSum == rSum)
                System.out.println(lAns + "and " + rAns);
            return;
        }

        split(arr, vidx + 1, lAns + arr[vidx] + " ", rAns, lSum + arr[vidx], rSum);
        split(arr, vidx + 1, lAns, rAns + arr[vidx] + " ", lSum, rSum + arr[vidx]);

    }

    public static int splitArray(int[] arr, int vidx, String lAns, String rAns, int lSum, int rSum) {

        if (arr.length == vidx) {
            if (lSum == rSum) {
                System.out.println(lAns + "and " + rAns);
                return 1;
            }

            return 0;
        }

        int lc = splitArray(arr, vidx + 1, lAns + arr[vidx] + " ", rAns, lSum + arr[vidx], rSum);
        int rc = splitArray(arr, vidx + 1, lAns, rAns + arr[vidx] + " ", lSum, rSum + arr[vidx]);

        return lc + rc;
    }

}
