package test;

public class doctors {
    public static void main(String[] args) {

        int[] exp = {1, 2, 3, 4};
        timeToTake(exp);

    }

    public static void timeToTake(int[] arr) {

        int max = Integer.MIN_VALUE;
        int patient = 10;


        int p = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            max = Math.max(p, max);

            for (int j = 1; sum <= patient; j++) {

                p = sum;
                sum = sum + arr[i] * j;

            }

//            System.out.println(sum);
        }

        System.out.println(max);
    }

}
