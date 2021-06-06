package practice.array.arrays2D;

public class RowWithMax1s {
    public static void main(String[] args) {

        int[][] arr = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        max1s(arr);

    }

    public static void max1s(int[][] arr) {

        int max1sRow = 0;
        int maxRow1s = 0;

        for (int row = 0; row < arr.length; row++) {

            int curr1s = 0;

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == 1)
                    curr1s++;

            }

            if (curr1s > max1sRow) {
                maxRow1s = row;
                max1sRow = curr1s;
            }

        }

        if (max1sRow > 0)
            System.out.println(maxRow1s);
        else System.out.println(-1);
    }

}
