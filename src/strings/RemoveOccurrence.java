package strings;

import java.util.Scanner;

public class RemoveOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String remove = sc.next();

        System.out.println(str.replace(remove, ""));

    }
}
