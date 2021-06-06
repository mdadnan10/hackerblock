package recursion;

import java.util.Scanner;

public class FountAtLast {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();
        System.out.println(findLast(arr, 0, target));
    }

    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int findLast(int[] arr, int vidx, int target) {

        if (arr.length == vidx) return -1;

        int found = findLast(arr, vidx + 1, target);

        if (arr[vidx] == target && found == -1)
            return vidx;

        return found;
    }

}
