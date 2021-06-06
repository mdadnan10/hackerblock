package seraching;

public class NumberOfZeroes {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(searchZeroes(arr));

    }

    public static int searchZeroes(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){

            int mid = (low + high) / 2;

            if (arr[low] > arr[mid]){
                high = mid - 1;
            } else if (arr[low] < arr[mid]){
                low = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }

}