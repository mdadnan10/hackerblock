package practice.array;

import java.util.Scanner;

public class RotateImage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();

        displayRotatedImage(rotate90DegAntiClockWise(arr));


    }

    public static int[][] takeInput() {

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++)
                arr[row][col] = sc.nextInt();

        }

        return arr;
    }

    public static void displayRotatedImage(int[][] res) {

        int n = res.length;

        for (int row = n - 1; row >= 0; row--) {

            for (int col = 0; col < n; col++)
                System.out.print(res[row][col] + " ");

            System.out.println();
        }

    }

    public static int[][] rotate90DegAntiClockWise(int[][] arr) {

        int n = arr.length;

        int[][] res = new int[n][n];

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                res[row][col] = arr[col][row];

            }

        }


        return res;
    }

}
