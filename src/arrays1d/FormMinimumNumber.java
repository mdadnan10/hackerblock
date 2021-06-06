package arrays1d;

import java.util.ArrayList;
import java.util.Scanner;

public class FormMinimumNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            minimumSequence(str);
        }

    }

    public static void minimumSequence(String arr) {

        int start = 1, pos = 0;
        ArrayList<Integer> res = new ArrayList<>();

        if (arr.charAt(0) == 'I') {
            res.add(1);
            res.add(2);
            start = 3;
            pos = 1;
        } else {
            res.add(2);
            res.add(1);
            start = 3;
        }
        for (int i = 1; i < arr.length(); i++) {
            if (arr.charAt(i) == 'I') {
                res.add(start);
                start++;
                pos = i + 1;
            } else {
                res.add(res.get(i));
                for (int j = pos; j <= i; j++)
                    res.set(j, res.get(j) + 1);
                start++;
            }
        }

        for (Integer val : res)
            System.out.print(val);
        System.out.println();

    }

}
