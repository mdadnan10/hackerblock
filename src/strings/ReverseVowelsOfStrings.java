package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseVowelsOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        reverseVowels(str);

    }

    public static void reverseVowels(String str) {

        StringBuilder v = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                v.append(str.charAt(i));
        }
        int ch = v.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                ans.append(v.charAt(ch));
                ch--;
            } else {
                ans.append(str.charAt(i));
            }
        }

        System.out.println(ans);
    }

}
