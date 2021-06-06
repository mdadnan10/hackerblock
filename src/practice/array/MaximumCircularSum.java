package practice.array;

public class MaximumCircularSum {
    public static void main(String[] args) {

        int[] arr = {5, -3, 5};
        System.out.println(maxSubArraySum(arr));

    }

    public static int kadane(int[] arr) {

        int max = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(sum, max);

        }

        return max;
    }

    public static int maxSubArraySum(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int l = 0; l < arr.length; l++) {

            if (arr[l] > 0) {

                int straightSum = kadane(arr);

                int pSum = 0;

                for (int i = 0; i < arr.length; i++) {

                    pSum += arr[i];
                    arr[i] = -arr[i];

                }

                int inverseSum = kadane(arr);
                int circularSum = pSum + inverseSum;

                return Math.max(straightSum, circularSum);
            } else max = Math.max(max, arr[l]);

        }

        return max;
    }

}
