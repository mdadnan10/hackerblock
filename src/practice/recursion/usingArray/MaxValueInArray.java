package practice.recursion.usingArray;

public class MaxValueInArray {
    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 60, 80, 30, 70};
        System.out.println(maxValue(arr, 0));

    }

    public static int maxValue(int[] arr, int vidx) {

        if (arr.length == vidx) return Integer.MIN_VALUE;

        int val = maxValue(arr, vidx + 1);

        return Math.max(arr[vidx], val);
    }

}
