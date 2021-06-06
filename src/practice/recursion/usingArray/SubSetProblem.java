package practice.recursion.usingArray;

import java.util.Scanner;

public class SubSetProblem {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();

        subset(arr, 0, target, 0, "");
        System.out.println();
        System.out.println(count);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void subset(int[] arr, int vidx, int target, int sum, String ans) {

        if (arr.length == vidx) {
            if (target == sum) {
                System.out.print(ans + " ");
                count++;
            }
            return;
        }

        subset(arr, vidx + 1, target, sum + arr[vidx], ans + arr[vidx] + " ");
        subset(arr, vidx + 1, target, sum, ans);

    }

}
