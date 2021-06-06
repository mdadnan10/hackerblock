package practice.array.arrays1D;

public class MaximumProductSubArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};
        subArray(arr);

    }

    public static void subArray(int[] arr) {

        int product = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++){

                int currProd = 1;

                for (int k = i; k <= j; k++)
                    currProd *= arr[k];

                product = Math.max(currProd, product);
            }

        }

        System.out.println(product);
    }

}
