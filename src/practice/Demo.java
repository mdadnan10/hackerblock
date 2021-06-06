package practice;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr1 = new int[N];
        for (int a = 0; a < N; a++) {
            arr1[a] = s.nextInt();
        }
        int M = s.nextInt();
        int[] arr2 = new int[M];
        for (int b = 0; b < M; b++) {
            arr2[b] = s.nextInt();
        }
        UnionArray(arr1, arr2);
        System.out.println();
        int m = arr1.length;
        int n = arr2.length;
        printIntersection(arr1, arr2, m, n);
    }

    public static void UnionArray(int arr1[], int arr2[]) {

        int m = arr1[arr1.length - 1];
        int n = arr2[arr2.length - 1];

        int ans = 0;

        if (m > n) {
            ans = m;
        } else
            ans = n;


        int newtable[] = new int[ans + 1];

        System.out.print(arr1[0] + " ");

        ++newtable[arr1[0]];

        for (int i = 1; i < arr1.length; i++) {

            if (arr1[i] != arr1[i - 1]) {
                System.out.print(arr1[i] + " ");
                ++newtable[arr1[i]];
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            if (newtable[arr2[j]] == 0) {
                System.out.print(arr2[j] + " ");
                ++newtable[arr2[j]];
            }
        }
    }

    static void printIntersection(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
}
