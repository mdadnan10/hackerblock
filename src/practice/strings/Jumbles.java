package practice.strings;

import java.util.Scanner;

public class Jumbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        String jum = sc.nextLine().trim();

        if (jumbles1(str, jum))
            System.out.println("True");
        else System.out.println("False");

    }

    public static boolean jumbles(String str, String jum) {

        if (str.length() != jum.length())
            return false;

        int[] s1 = new int[256];
        int[] j1 = new int[256];

        for (int i = 0; i < str.length(); i++) {
            s1[str.charAt(i)] += 1;
        }

        for (int i = 0; i < jum.length(); i++) {
            j1[jum.charAt(i)] += 1;
        }


        for (int i = 0; i < s1.length; i++) {

            if (s1[i] != j1[i])
                return false;
        }

        for (int val : s1)
            if (val > 0)
                System.out.print(val + " ");


        for (int val : j1)
            if (val > 0)
                System.out.print(val + " ");

        return true;
    }

    public static boolean jumbles1(String str, String jum) {

        if (str.length() != jum.length()) return false;

        int[] strs = new int[256];
        int[] jums = new int[256];

        for (int i = 0; i < str.length(); i++)
            strs[str.charAt(i)] += 1;

        for (int i = 0; i < jum.length(); i++)
            jums[jum.charAt(i)] += 1;

        for (int i = 0; i < 256; i++)
            if (strs[i] != jums[i]) return false;

        return true;
    }

}
