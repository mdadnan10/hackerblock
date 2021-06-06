package arrays1d;

import java.util.Arrays;
import java.util.Scanner;

public class SortJustZeroesAndOnes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        Arrays.sort(arr);

        for (int val: arr)
            System.out.print(val + " ");

    }

    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

}
