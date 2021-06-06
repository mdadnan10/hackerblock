package practice.array.serch;

import java.util.Scanner;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();
        System.out.println(linearSearch(arr, target));

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return i;


        return -1;
    }

}
