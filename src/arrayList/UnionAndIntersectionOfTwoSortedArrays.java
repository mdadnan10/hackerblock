package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UnionAndIntersectionOfTwoSortedArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] one = takeInput();
//        int[] two = takeInput();
        int[] one = {1, 2, 2, 4, 6, 6, 8, 8};
        int[] two = {4, 4, 6, 8, 8, 10, 12, 15};
        union(one, two);
        System.out.println();
        intersection(one, two);

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static void union(int[] one, int[] two) {

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < one.length && j < two.length) {

            if (one[i] < two[j]) {
                union.add(one[i]);
                i++;
            } else if (one[i] > two[j]) {
                union.add(two[j]);
                j++;
            } else {
                union.add(one[i]);
                i++;
                j++;
            }

        }

        while (i < one.length) {
            union.add(one[i]);
            i++;
        }
        while (j < two.length) {
            union.add(two[j]);
            j++;
        }

        Collections.sort(union);

        ArrayList<Integer> res = new ArrayList<>();

        for (int si = 0; si < union.size() - 1; si++) {

            if (!union.get(si).equals(union.get(si + 1)))
                res.add(union.get(si));
        }

        res.add(union.get(union.size() - 1));

        for (int val : res)
            System.out.print(val + " ");

    }

    public static void intersection(int[] one, int[] two) {

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < one.length && j < two.length) {

            if (one[i] < two[j])
                i++;
            else if (one[i] > two[j])
                j++;
            else {
                intersection.add(one[i]);
                i++;
                j++;
            }

        }
        Collections.sort(intersection);

        ArrayList<Integer> res = new ArrayList<>();

        for (int si = 0; si < intersection.size() - 1; si++) {

            if (!intersection.get(si).equals(intersection.get(si + 1)))
                res.add(intersection.get(si));
        }

        res.add(intersection.get(intersection.size() - 1));

        for (int val : res)
            System.out.print(val + " ");


    }

}
