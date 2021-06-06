package practice.recursion;

import java.math.BigInteger;

public class SubsetProblem {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3,};
        int target = 3;
        subset(arr, 0, target, 0, "");

    }

    public static void subset(int[] arr, int vidx, int target, int sum, String ans) {

        if (arr.length == vidx) {
            if (sum == target)
                System.out.print(ans + " ");
            return;
        }

        subset(arr, vidx + 1, target, sum + arr[vidx], ans + arr[vidx]);
        subset(arr, vidx + 1, target, sum, ans);

    }

}
