package practice450.arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        mergeTwoArrays(arr1, arr2);

    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];

        int one = 0;
        int two = 0;

        int i = 0;
        while (one < n && two < m){

            if (arr1[one] > arr2[two]){
                merged[i] = arr2[two];
                two++;
                i++;
            }
            else if (arr1[one] < arr2[two]){
                merged[i] = arr1[one];
                one++;
                i++;
            }
            else {
                merged[i] = arr1[one];
                one++;
                two++;
                i++;

            }

        }

        while (one < n) {
            merged[i] = arr1[one];
            one++;
            i++;
        }

        while (two < m){
            merged[i] = arr2[two];
            two++;
            i++;
        }

        for (int val : merged)
            System.out.print(val + " ");

    }

}
