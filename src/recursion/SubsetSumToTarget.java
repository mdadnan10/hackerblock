package recursion;

import java.util.Scanner;

public class SubsetSumToTarget {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = takeInput(n);
        if (subsetSumTarget(arr, target, 0))
            System.out.println("Yes");
        else System.out.println("No");
    }

    private static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    private static boolean subsetSumTarget(int[] arr, int target, int vidx) {

        if (target == 0) {
            return true;
        }

        if (target < 0 || arr.length == vidx) return false;

        boolean res = false;

        res = subsetSumTarget(arr, target - arr[vidx], vidx + 1);

        return res;
    }
}
