package practice450.arrays;

public class MoveAllNegativeNumbers {
    public static void main(String[] args) {

        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNegativeNumbers(arr);
        display(arr);

    }

    public static void display(int[] arr){

        for (int val : arr)
            System.out.print(val + " ");

    }

    public static void moveNegativeNumbers(int[] arr) {

        int right = arr.length - 1;
        int left = arr.length - 1;

        while (right >= 0) {

            if (arr[right] < 0) right--;
            else {

                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                right--;
                left--;
            }

        }

    }

}
