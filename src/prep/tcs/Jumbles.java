package prep.tcs;

import java.util.Scanner;

public class Jumbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next().trim();
        String b = sc.next().trim();

        if (jumbles(a, b))
            System.out.println("True");
        else System.out.println("False");

    }

    public static boolean jumbles(String a, String b) {

        if (a.length() != b.length())
            return false;

        int[] a1 = new int[256];

        for (int i = 0; i < a.length(); i++)
            a1[a.charAt(i)] += 1;

        int[] b1 = new int[256];

        for (int i = 0; i < b.length(); i++)
            b1[b.charAt(i)] += 1;

        for (int i = 0; i < 256; i++)
            if (a1[i] != b1[i])
                return false;

        return true;
    }

}
