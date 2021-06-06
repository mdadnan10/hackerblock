package arrays1d;

public class Kadane {

    public static void main(String[] args) {

        int[] arr = {2, 3, -6, 1, 2, 3, -4, 5, -10, 6};

        int max = arr[0];
        int sum = arr[0];
        int[] start = new int[arr.length];
        start[0] = 0;

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
