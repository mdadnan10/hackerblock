package recursion;

import java.util.Scanner;

public class FountAt {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();
        System.out.println(fountAt(arr, 0, target));
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int fountAt(int[] arr, int vidx, int target) {

        if (arr.length == vidx) return -1;

        if (arr[vidx] == target)
            return vidx;

        return fountAt(arr, vidx + 1, target);
    }

}
