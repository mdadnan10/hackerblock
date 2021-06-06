package practice.strings;

import java.util.Scanner;

public class RemoveAllOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);
        removeAllOccurrence(str, ch);

    }

    public static void removeAllOccurrence(String str, char ch) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ch)
                ans.append(str.charAt(i));

        }

        System.out.println(ans);

    }

}
