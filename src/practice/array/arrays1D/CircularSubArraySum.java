package practice.array.arrays1D;

public class CircularSubArraySum {
    public static void main(String[] args) {

        int[] arr = {3, -1, 2, -1};
        System.out.println(maxSum(arr));

    }

    public static int kadane(int[] arr) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : arr) {

            sum = Math.max(sum + i, i);
            max = Math.max(sum, max);

        }

        return max;
    }

    public static int maxSum(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int l = 0; l < arr.length; l++) {

            if (arr[l] > 0) {
                int straightSum = kadane(arr);

                int sum = 0;
                for (int i = 0; i < arr.length; i++) {

                    sum += arr[i];
                    arr[i] = -arr[i];

                }

                int inverseSum = kadane(arr);
                int circularSum = sum + inverseSum;

                return Math.max(straightSum, circularSum);
            } else
                max = Math.max(max, arr[l]);

        }

        return max;
    }

}
