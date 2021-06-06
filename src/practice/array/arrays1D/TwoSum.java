package practice.array.arrays1D;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(arr, target);

        for (int val : res)
            System.out.print(val + " ");

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
        }

        return res;
    }

}