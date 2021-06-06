package divideAndConquer;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {80, 10, 50, 30, 60, 20, 70, 25};
        int[] res = mergeSort(arr, 0, arr.length - 1);

        for (int val : res)
            System.out.print(val + " ");
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        int[] merged = new int[m + n];
        int i = 0;

        int one = 0;
        int two = 0;

        while (one < m && two < n) {

            if (arr1[one] < arr2[two]) {
                merged[i] = arr1[one];
                one += 1;
                i++;
            } else {
                merged[i] = arr2[two];
                two += 1;
                i++;
            }
        }

        while (one < m) {
            merged[i] = arr1[one];
            one += 1;
            i += 1;
        }

        while (two < n) {
            merged[i] = arr2[two];
            two += 1;
            i += 1;
        }

        return merged;
    }

    public static int[] mergeSort(int[] arr, int low, int high) {

        if (low == high) {
            int[] br = {arr[low]};
            return br;
        }

        int mid = (low + high) / 2;

        int[] fh = mergeSort(arr, low, mid);
        int[] sh = mergeSort(arr, mid + 1, high);

        int[] sorted = merge(fh, sh);

        return sorted;
    }
}
