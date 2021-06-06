package bitManipulation;

import java.util.Scanner;

public class UniqueNumber1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = takeInput();
        uniqueNumber(arr);

    }

    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void uniqueNumber(int[] arr){

        int uniqueNumber = 0;

        for (int val : arr)
            uniqueNumber = uniqueNumber ^ val;

        System.out.println(uniqueNumber);
    }

}
