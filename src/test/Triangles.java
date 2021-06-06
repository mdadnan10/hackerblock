package test;

import java.util.Scanner;

public class Triangles {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        triangle(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void triangle(int[] arr) {

        int count = 0;

        for (int b = 0; b < arr.length; b++) {

            for (int h = b + 1; h < arr.length; h++) {


                for (int l = h + 1; l < arr.length; l++) {

                    if (arr[b] + arr[h] > arr[l] && arr[b] + arr[l] > arr[h] && arr[l] + arr[h] > arr[b])
                        count++;

                }


            }

        }

        System.out.println(count);
    }

}
