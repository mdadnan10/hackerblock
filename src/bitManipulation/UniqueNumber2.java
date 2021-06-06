package bitManipulation;

import java.util.Scanner;

public class UniqueNumber2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        uniqueNumber2(arr);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void uniqueNumber2(int[] arr) {

        int xor = 0;

        for (int val : arr)
            xor ^= val;

        int rmbs = (xor & -xor);

        int num1 = 0;
        int num2 = 0;

        for (int val : arr) {

            if ((rmbs & val) == 1)
                num1 ^= val;
            else
                num2 ^= val;

        }

        if (num1 > num2) {
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println(num1);
            System.out.println(num2);
        }

    }

    public static void uniqueNumber2Again(int[] arr){



    }
}
