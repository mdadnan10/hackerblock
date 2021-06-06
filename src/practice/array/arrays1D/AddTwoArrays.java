package practice.array.arrays1D;

import java.util.Scanner;

public class AddTwoArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr1 = takeInput();
        int[] arr2 = takeInput();
        addArrays(arr1, arr2);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void addArrays(int[] arr1, int[] arr2) {

        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();

        for (int i : arr1)
            sum1.append(i);

        for (int i : arr2)
            sum2.append(i);

        int sum = Integer.parseInt(sum1.toString()) + Integer.parseInt(sum2.toString());
        String ans = String.valueOf(sum);


        for (int i = 0; i < ans.length(); i++)
            if (i == ans.length() - 1)
                System.out.print(ans.charAt(i) + ", END");
            else System.out.print(ans.charAt(i) + ", ");

    }

}
