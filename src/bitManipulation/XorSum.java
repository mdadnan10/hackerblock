package bitManipulation;

public class XorSum {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 7};

        int res = 0;

        for (int val : arr)
            res ^= val;

        System.out.println(res);
    }
}
