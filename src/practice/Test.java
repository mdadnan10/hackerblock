package practice;

import java.util.*;

public class Test {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int[] one = new int[m];
        for (int i = 0; i < m; i++) {
            one[i] = scn.nextInt();
        }
        int n = scn.nextInt();
        int[] two = new int[n];
        for (int i = 0; i < n; i++) {
            two[i] = scn.nextInt();
        }
        inter_union(one, two, m, n);
    }

    public static void inter_union(int[] one, int[] two, int M, int N) {
        ArrayList<Integer> inter = new ArrayList<>();
        ArrayList<Integer> uone = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < M && j < N) {
            if (one[i] == two[j]) {
                inter.add(one[i]);
                i++;
                j++;
            } else if (one[i] < two[j]) {
                i++;
            } else
                j++;
        }
        for (int m = 0; m < one.length; m++)
            uone.add(one[m]);
        int k;
        for (k = 0; k < two.length; k++) {
            int x = 0;
            for (; x < one.length; x++) {
                if (two[k] == one[x])
                    break;
            }
            if (x == one.length) {
                uone.add(two[k]);
            }
        }
        Collections.sort(uone);
        for (int d = uone.size() - 1; d >= 0; d--) {
            if (--d < 0)
                break;
            int num1 = uone.get(d);
            int num2 = uone.get(--d);
            if (num1 == num2) {
                uone.remove(d);
            }
        }
        Collections.sort(inter);
        for (int val : uone) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int value : inter) {
            System.out.print(value + " ");
        }
    }
}
