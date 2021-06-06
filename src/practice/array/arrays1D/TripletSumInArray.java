package practice.array.arrays1D;

import java.util.Arrays;

public class TripletSumInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 6};
        Arrays.sort(arr);
        int target = 10;
        System.out.println(triplets(arr, target));

    }

    public static boolean triplets(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum < target) j++;
                else if (sum > target) k--;
                else return true;

            }

        }

        return false;
    }

}
