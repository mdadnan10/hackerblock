package arrays2d;

import java.util.Scanner;

public class RotateImage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        rotate(arr);

    }

    public static int[][] takeInput() {

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int row = 0; row < n; row++){

            for (int col = 0; col < n; col++)
                arr[row][col] = sc.nextInt();

        }

        return arr;
    }

    public static void rotate(int[][] arr) {

        for (int col = arr[0].length - 1; col >= 0; col--) {

            for (int row = 0; row < arr.length; row++)
                System.out.print(arr[row][col] + " ");
            System.out.println();
        }

    }

}
