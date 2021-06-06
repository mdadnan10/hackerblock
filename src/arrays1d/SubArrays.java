package arrays1d;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {2, 3, -6, 1, 2, 3, -4, 5, -10, 6};
//        subArray(arr);
//        sumOfSubArray(arr);
//        sumOfSubArray2Loops(arr);
//        maxOfSubArray(arr);
//        kadane(arr);
        kadane2(arr);
    }

    public static void subArray(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {

                for (int j = k; j <= i; j++)
                    System.out.print(arr[j] + " ");

                System.out.println();
            }
        }
    }

    public static void sumOfSubArray(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {

                int sum = 0;
                for (int j = k; j <= i; j++)
                    sum += arr[j];

                if (sum == 0)
                    System.out.println();
                else System.out.println(sum + " ");

            }
        }
    }

    public static void sumOfSubArray2Loops(int[] arr) {

        for (int j = 0; j < arr.length; j++) {

            int sum = 0;
            for (int i = j; i < arr.length; i++) {
                sum += arr[i];
                System.out.println(sum);
            }

        }

    }

    public static void maxOfSubArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < arr.length; j++) {

            int sum = 0;
            for (int i = j; i < arr.length; i++) {
                sum += arr[i];
                if (sum > max)
                    max = sum;
            }

        }

        System.out.println(max);

    }

    public static void kadane(int[] arr) {

        int sum = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            sum = Math.max(sum + arr[i], arr[i]);

            if (sum > max)
                max = sum;

        }

        System.out.println(max);
    }

    public static void kadane2(int[] arr) {

        int[] start = new int[arr.length];
        start[0] = 0;

        int sum = arr[0];
        int max = arr[0];

        int ei = 0;
        for (int i = 1; i < arr.length; i++) {

            if (sum + arr[i] >= arr[i])
                start[i] = start[i - 1];
            else start[i] = i;

            sum = Math.max(sum + arr[i], arr[i]);

            if (sum > max) {
                ei = i;
                max = sum;
            }

        }

        System.out.println(max);
        System.out.println(start[ei] + " " + ei);

    }
}
