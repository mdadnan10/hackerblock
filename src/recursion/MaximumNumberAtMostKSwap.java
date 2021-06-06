package recursion;

import java.util.Scanner;

public class MaximumNumberAtMostKSwap {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = Integer.toString(n);
        int k = sc.nextInt();
        findMax(str, k);
        System.out.println(max);
    }

    public static void findMax(String str, int k) {

        if (Integer.parseInt(str) > max)
            max = Integer.parseInt(str);

        if (k == 0) return;

        for (int i = 0; i < str.length() - 1; i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) < str.charAt(j)) {
                    String swapped = swap(str, i, j);
                    findMax(swapped, k - 1);
                }

            }

        }

    }

    public static String swap(String str, int i, int j) {

        char iTh = str.charAt(i);
        char jTh = str.charAt(j);

        String left = str.substring(0, i);
        String middle = str.substring(i + 1, j);
        String right = str.substring(j + 1);

        return left + jTh + middle + iTh + right;
    }

}
