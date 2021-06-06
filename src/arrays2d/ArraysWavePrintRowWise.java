package arrays2d;

import java.util.Scanner;

public class ArraysWavePrintRowWise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        displayRowWise(arr);

    }

    public static int[][] takeInput() {

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[r].length; c++)
                arr[r][c] = sc.nextInt();

        }

        return arr;
    }

    public static void displayRowWise(int[][] arr) {

        for (int r = 1; r <= arr.length; r++) {

            if (r % 2 == 0) {
                for (int c = arr[r - 1].length - 1; c >= 0; c--)
                    if (r == arr.length && c == 0)
                        System.out.print(arr[r - 1][c] + ", END");
                    else
                        System.out.print(arr[r - 1][c] + ", ");
            } else {
                for (int c = 0; c < arr[r - 1].length; c++)
                    if (r == arr.length && c == arr[r - 1].length - 1) {
                        System.out.print(arr[r - 1][c] + ", END");
                    } else
                        System.out.print(arr[r - 1][c] + ", ");
            }

        }

    }

}

