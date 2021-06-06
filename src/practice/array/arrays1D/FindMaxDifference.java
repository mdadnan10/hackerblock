package practice.array.arrays1D;

import java.util.ArrayList;

public class FindMaxDifference {
    public static void main(String[] args) {
        int[] arr = {10, 11, 7, 12, 14};
        maxDiff(findMaxDifference(arr));
    }

    public static void maxDiff(ArrayList<Integer> res) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < res.size(); i++)
            if (max < res.get(i))
                max = res.get(i);

        System.out.println(max);
    }

    public static ArrayList<Integer> findMaxDifference(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = i + 1;

        while (j < arr.length) {

            int diff = arr[i] - arr[j];
            res.add(diff);

            i++;
            j++;
        }

        return res;
    }

}
