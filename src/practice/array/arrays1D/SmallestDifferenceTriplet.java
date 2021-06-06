package practice.array.arrays1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestDifferenceTriplet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        int n = sc.nextInt();
//
//        int[] arr1 = takeInput(n);
//        int[] arr2 = takeInput(n);
//        int[] arr3 = takeInput(n);
//        int[] res = smallestTriplet(arr1, arr2, arr3);
        int a[] = {15, 12, 18, 9};
        int b[] = {10, 17, 13, 8};
        int c[] = {14, 16, 11, 5};
        ArrayList<Integer> ans = smallestDifferenceTriplet(a, b, c, 4);
        System.out.println(ans);
    }

    public static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        return arr;
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minInd = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[minInd] < arr[j]) minInd = j;

            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr)
            System.out.print(i + " ");

    }

    public static int[] smallestTriplet(int[] arr1, int[] arr2, int[] arr3) {

        int n = arr1.length;

        int[] ans = new int[3];

        int i = 0;
        int j = 0;
        int k = 0;

        int diff = Integer.MAX_VALUE;
        while (i < n && j < n && k < n) {

            int sum = arr1[i] + arr2[j] + arr3[k];

            int max = Math.max(Math.max(arr1[i], arr2[j]), arr3[k]);

            int min = Math.min(Math.min(arr1[i], arr2[j]), arr3[k]);

            if (min == arr1[i]) i++;
            else if (min == arr2[j]) j++;
            else k++;

            if (diff > (max - min)) {

                diff = max - min;
                ans[0] = max;
                ans[1] = sum - (min + max);
                ans[2] = min;

            }

        }

        return ans;
    }

    public static ArrayList<Integer> smallestDifferenceTriplet(int a[], int b[], int c[], int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int low = 0;
        int mid = 0;
        int high = 0;

        int i = 0;
        int j = 0;
        int k = 0;

        int diff = Integer.MAX_VALUE;

        while (i < n && j < n && k < n) {

            int sum = a[i] + b[j] + c[k];

            int max = Math.max(Math.max(a[i], b[j]), c[k]);
            int min = Math.min(Math.min(a[i], b[j]), c[k]);

            if (min == a[i]) i++;
            else if (min == b[j]) j++;
            else k++;

            if (diff > (max - min)) {

                diff = max - min;
                low = max;
                mid = sum - (max + min);
                high = min;

            }

        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(low);
        res.add(mid);
        res.add(high);
        return res;
    }

}