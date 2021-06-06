package practice.array.arrays1D;

import java.util.Scanner;

public class ZeroesAtTheEnd {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        zerosAtEnd(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void display(int[] arr){

        for (int val : arr)
            System.out.print(val + " ");

    }

    public static void zerosAtEnd(int[] arr) {

        int[] res = new int[arr.length];
        int j = 0;

        for (int i : arr) {
            if (i != 0) {
                res[j] = i;
                j++;
            }
        }

        for (int val : res)
            System.out.print(val + " ");
    }

    public static void moveZeros(int[] arr) {

        int left = 0;
        int right = 0;

        while (right < arr.length) {

            if (arr[right] == 0) right++;
            else {

                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left++;
                right++;
            }

        }

    }

}
