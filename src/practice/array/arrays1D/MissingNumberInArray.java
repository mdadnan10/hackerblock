package practice.array.arrays1D;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int n = 2;
        int[] arr = {1};
        System.out.println(missingNumber(arr, n));

    }

    public static int missingNumber(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {

            if (arr.length == n) return i + 1;
            else if (i != arr[i - 1]) return i;

        }

        return 0;
    }

}
