package practice.array.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] arr1 = sort(takeInput(n));
        int[] arr2 = sort(takeInput(n));

        System.out.println(intersectionOfTwoArrays(arr1, arr2));

    }

    public static int[] takeInput(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minInd = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[minInd] > arr[j]) minInd = j;

            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }

        return arr;
    }

    public static ArrayList<Integer> intersectionOfTwoArrays(int[] arr1, int[] arr2) {

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length || j < arr2.length) {

            if (arr1[i] < arr2[j]) i++;
            else if (arr1[i] > arr2[j]) j++;
            else {

                intersection.add(arr1[i]);

                i++;
                j++;
            }

        }

        return intersection;
    }

}
