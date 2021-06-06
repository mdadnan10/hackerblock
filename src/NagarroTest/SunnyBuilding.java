package NagarroTest;

import java.util.Scanner;

public class SunnyBuilding {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

        int[] arr = {7, 4, 8, 2, 9};
        sunnyBuilding(arr);

        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void sunnyBuilding(int[] arr) {

        int count = 1;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max || arr[i] == max) {

                count++;
                max = arr[i];

            }

        }

        System.out.println(count);

    }

}
