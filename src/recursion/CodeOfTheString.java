package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeOfTheString {

    static char[] characters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static int n = 0;

    public static void main(String[] args) {

        String ques = "1125";
        n = ques.length();
        char[] q = ques.toCharArray();
        char[] a = new char[100];

        codes(q, a, 0, 0);

    }

    public static void codes(char[] ques, char[] ans, int i, int j) {

        if (ques[i] == '0') {
            ans[j] = '0';
            return;
        }

        int digit = ques[i] - '0';
        ans[j] = characters[digit];
        codes(ques, ans, i + 1, j + 1);

        if (i + 1 < n) {
            int digit2 = (ques[i] - '0') * 10 + (ques[i + 1] - '0');
            if (digit2 <= 26) {
                ans[j] = characters[digit2];
                codes(ques, ans, i + 2, j + 1);
            }
        }

    }

}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ques = sc.nextLine();

        ArrayList<String> str = new ArrayList<>();
        str = codesOfString(ques, "", str);

        System.out.println(str);
    }

    public static ArrayList<String> codesOfString(String ques, String ans, ArrayList<String> res) {
        if (ques.length() == 0) {
            res.add(ans);
            return res;
        }


        String ch1 = ques.substring(0, 1);
        int x1 = 96 + Integer.parseInt(ch1);
        String roq1 = ques.substring(1);
        res = codesOfString(roq1, ans + (char) x1, res);

        if (ques.length() >= 2) {
            String ch2 = ques.substring(0, 2);
            if (Integer.parseInt(ch2) >= 10 && Integer.parseInt(ch2) <= 26) {
                int x2 = 96 + Integer.parseInt(ch2);
                String roq2 = ques.substring(2);
                res = codesOfString(roq2, ans + (char) x2, res);
            }
        }

        return res;
    }
}
