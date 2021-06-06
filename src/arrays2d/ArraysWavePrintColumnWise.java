package arrays2d;

import java.util.Scanner;

public class ArraysWavePrintColumnWise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = takeInput();
        displayWave(arr);

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

    public static void displayWave(int[][] arr) {

        for (int i = 0; i < 1; i++) {

            for (int c = 1; c <= arr[i].length; c++) {

                if (c % 2 == 0) {
                    for (int r = arr.length - 1; r >= i; r--) {
                        if (c == arr[r].length && r == 0)
                            System.out.print(arr[r][c - 1] + ", END");
                        else System.out.print(arr[r][c - 1] + ", ");
                    }
                } else {
                    for (int r = 0; r < arr.length; r++) {
                        if (c == arr[r].length && r == arr.length - 1)
                            System.out.print(arr[r][c - 1] + ", END");
                        else System.out.print(arr[r][c - 1] + ", ");
                    }
                }

            }

        }
    }

}
