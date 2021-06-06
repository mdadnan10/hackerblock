package recursion;

import java.util.Scanner;

public class SubsetSumEasy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();

            if (subset(arr, 0, "", 0, 0, arr.length))
                System.out.println("Yes");
            else System.out.println("No");
        }

//        int[] arr = {1, 2, 3, 5};
//        System.out.println(subset(arr, 0, "", 0, 0, arr.length));

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static boolean subsetSum(int[] arr, int vidx, String ans, int count) {

        if (arr.length == vidx) {
            return count == 0;
        }

        boolean res1 = subsetSum(arr, vidx + 1, ans, count);
        boolean res2 = subsetSum(arr, vidx + 1, ans + arr[vidx], count + arr[vidx]);

        return res1 || res2;
    }

    public static boolean subset(int[] arr, int vidx, String ans, int sum, int count, int len) {

        if (arr.length == vidx) {
            return len != count && sum == 0;
        }

        boolean res1 = subset(arr, vidx + 1, ans, sum, count + 1, len);
        boolean res2 = subset(arr, vidx + 1, ans + arr[vidx], sum + arr[vidx], count, len);

        return res1 || res2;
    }

}
