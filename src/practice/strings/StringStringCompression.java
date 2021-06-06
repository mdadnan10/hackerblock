package practice.strings;

import java.util.Scanner;

public class StringStringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        compression(str);

    }

    public static void compression(String str) {

        int count = 1;

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i <= str.length() - 1; i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) count++;
            else {

                ans.append(str.charAt(i));
                if (count > 1)
                    ans.append(count);

                count = 1;
            }
        }

        System.out.println(ans);

    }

}
