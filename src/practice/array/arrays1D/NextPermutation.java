package practice.array.arrays1D;

import java.util.Scanner;

public class NextPermutation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();
            nextPerm(arr);

        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void nextPerm(int[] arr) {

        int n = arr.length;

        int idx = -1;
        for (int i = n - 1; i > 0; i--) {

            if (arr[i] > arr[i - 1]) {
                idx = i;
                break;
            }

        }
        if (idx == -1) {
            reverse(arr, 0, n - 1);
        } else {

            int previous = idx;
            for (int i = idx + 1; i < n; i++) {

                if (arr[i] > arr[idx - 1] && arr[i] <= arr[previous]) {
                    previous = i;
                }
            }

            int temp = arr[idx - 1];
            arr[idx - 1] = arr[previous];
            arr[previous] = temp;
            reverse(arr, idx, n - 1);

        }

        for (int val : arr)
            System.out.print(val + " ");

    }

    public static void reverse(int[] arr, int si, int ei) {

        while (si < ei) {

            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;
        }

    }


}
