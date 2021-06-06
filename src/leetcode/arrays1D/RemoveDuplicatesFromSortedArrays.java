package leetcode.arrays1D;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArrays {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }

        for (int val: nums)
            System.out.print(val + " ");

        return i + 1;
    }

}
