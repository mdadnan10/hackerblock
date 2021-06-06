package strings;

import java.util.Arrays;

public class FormBiggestNumber {
    public static void main(String[] args) {

        int[] arr = {540, 546, 548, 600};
        sort(arr);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            String str = "";
            str += arr[i];
            int[] num = new int[3];
            for (int v = 0; v < str.length(); v++) {
                num[v] = str.charAt(v);
            }
            for (int val : num)
                System.out.print(val + " ");
            System.out.println();

        }

    }

}
