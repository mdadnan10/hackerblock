package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InterSection {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        takeInput();

    }

    public static void takeInput(){

        int n = sc.nextInt();
        int[] one = new int[n];
        int[] two = new int[n];

        for (int i = 0; i < n; i++)
            one[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            two[i] = sc.nextInt();

        Arrays.sort(one);
        Arrays.sort(two);

        interSection(one, two);

    }

    public static void interSection(int[] one, int[] two) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (i < one.length && j < two.length) {

            if (one[i] < two[j])
                i++;
            else if (one[i] > two[j])
                j++;
            else {
                res.add(one[i]);
                i++;
                j++;
            }
        }

        System.out.println(res);

    }
}
