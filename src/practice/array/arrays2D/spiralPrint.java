package practice.array.arrays2D;

public class spiralPrint {
    public static void main(String[] args) {

        int[][] arr = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        spiralPrinting(arr);

    }

    public static void spiralPrinting(int[][] arr) {

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;

        int nel = arr.length * arr[0].length;
        int count = 0;

        while (count < nel) {

            // first col
            for (int r = minRow; r <= maxRow && count < nel; r++) {
                System.out.print(arr[r][minCol] + " ");
                count++;
            }

            minCol++;

            // last row
            for (int c = minCol; c <= maxCol && count < nel; c++) {
                System.out.print(arr[maxRow][c] + " ");
                count++;
            }

            maxRow--;

            // last col
            for (int r = maxRow; r >= minRow && count < nel; r--) {
                System.out.print(arr[r][maxCol] + " ");
                count++;
            }

            maxCol--;

            // first row
            for (int c = maxCol; c >= minCol && count < nel; c--) {
                System.out.print(arr[minRow][c] + " ");
                count++;
            }

            minRow++;

        }

    }

}
