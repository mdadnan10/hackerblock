package practice.strings;

import java.util.Scanner;

public class JumblesDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();
        jumbles(s1, s2);

    }

    public static void jumbles(String s1, String s2) {

        int[] arr = new int[26];

        for (char c : s1.toCharArray())
            arr[c - 'a']++;

        for (char c : s2.toCharArray())
            arr[c - 'a']--;

        boolean status = true;

        for (int x : arr)
            if (x != 0) {
                status = false;
                break;
            }

        if (status) System.out.println("True");
        else System.out.println("False");
    }

}
