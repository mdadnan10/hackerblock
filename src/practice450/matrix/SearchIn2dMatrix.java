package practice450.matrix;

public class SearchIn2dMatrix {
    public static void main(String[] args) {

        int[][] arr = { {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60} };
        System.out.println(search(arr, 3));

    }

    public static boolean search(int[][] arr, int value){

        for (int row = 0; row < arr.length; row++){

            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == value) return true;
            }

        }

        return false;
    }

}
