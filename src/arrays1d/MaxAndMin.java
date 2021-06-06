package arrays1d;

import java.util.Scanner;

public class MaxAndMin {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        maxMin(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void maxMin(int[] arr){

        int max = arr[0];
        int min = arr[0];

        for (int val: arr) {

            if (max < val)
                max = val;
            if (min > val)
                min = val;
        }

        System.out.println(max + "\n" + min);

    }

}
