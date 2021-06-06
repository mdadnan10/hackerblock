package practice450.arrays;

public class Sort0s1sAnd2s {
    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 2, 0};

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {

            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }

        for (int val : arr)
            System.out.print(val + " ");

    }
}
