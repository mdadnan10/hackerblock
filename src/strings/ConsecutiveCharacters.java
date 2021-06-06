package strings;

import java.util.Scanner;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abbcccddddeeeeedcba";
//        longestCC(str);
        CC(str);

    }

    public static void CC(String str) {

        int len = str.length();
        int count = 0;

        for (int i = 0; i < len; i++) {

            int cur_count = 1;
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }

            if (cur_count > count)
                count = cur_count;
        }

        System.out.println(count);
    }

    public static void longestCC(String str) {

        int[] arr = new int[256];

        for (int i = 0; i < str.length() - 1; i++)
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;

        int max = Integer.MIN_VALUE;
        int ch = 0;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
                ch = i;
            }

        }

        System.out.println((char) ch);
        System.out.println(max);
    }
}
