package practice.array.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAllTriplets {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        int target = sc.nextInt();
        triplets(arr, target);

    }

    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        return arr;
    }

    public static void triplets(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int low = i + 1;
            int high = arr.length - 1;

            while (low < high) {

                int sum = arr[i] + arr[low] + arr[high];

                if (sum > target)
                    high--;
                else if (sum < target)
                    low++;
                else {
                    System.out.println(arr[i] + ", " + arr[low] + " and " + arr[high]);
                    low++;
                    high--;
                }

            }

        }

    }

}
