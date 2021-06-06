package arrays1d;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
//        sumTriplets(arr);
        sumTriplets2(arr);
    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        return arr;
    }

    public static void display(int i, int j, int k) {

        System.out.println(i + ", " + j + " and " + k);

    }

    public static void sumTriplets(int[] arr) {

        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = j; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        if (i != j && j != k)
                            display(arr[i], arr[j], arr[k]);
                    }

                }
            }

        }

    }

    public static void sumTriplets2(int[] arr) {

        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {

                if ((arr[j] + arr[k]) < (target - arr[i]))
                    j++;
                else if ((arr[j] + arr[k]) > (target - arr[i]))
                    k--;
                else {
                    display(arr[i], arr[j], arr[k]);
                    j++;
                    k--;
                }

            }

        }

    }

}
