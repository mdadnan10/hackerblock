package recursion;

import java.util.Scanner;

public class SubsetProblem {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {

        int[] arr = takeInput();

        int target = sc.nextInt();

        subset(arr, "", 0, 0, target);
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

    public static void subset(int[] ques, String ans, int vidx, int sum, int target) {

        if (ques.length == vidx) {
            if (sum == target) {
                System.out.print(ans + " ");
                count += 1;
            }
            return;
        }

        subset(ques, ans + ques[vidx] + " ", vidx + 1, sum + ques[vidx], target);
        subset(ques, ans, vidx + 1, sum, target);

    }

}
