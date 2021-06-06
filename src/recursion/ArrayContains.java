package recursion;

import java.util.Scanner;

public class ArrayContains {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();
        System.out.println(contains(arr, 0, target));
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static boolean contains(int[] arr, int vidx, int target) {

        if (arr.length == 0) return false;

        if (arr[vidx] == target)
            return true;

        return contains(arr, vidx + 1, target);
    }

}
