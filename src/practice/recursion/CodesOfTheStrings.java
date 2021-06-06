package practice.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CodesOfTheStrings {
    static char[] chars = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ques = "1125";
        ArrayList<String> list = codesOfStrings(ques, "", new ArrayList<>());
        System.out.println(list);

    }

    public static ArrayList<String> codesOfStrings(String ques, String ans, ArrayList<String> res) {

        if (ques.length() == 0) {
            res.add(ans);
            return res;
        }

        String ch1 = ques.substring(0, 1);
        String roq1 = ques.substring(1);
        char code1 = chars[Integer.parseInt(ch1)];
        res = codesOfStrings(roq1, ans + code1, res);

        if (ques.length() >= 2) {

            String ch2 = ques.substring(0, 2);

            if (Integer.parseInt(ch2) >= 10 && Integer.parseInt(ch2) <= 26) {

                String roq2 = ques.substring(2);
                char code2 = chars[Integer.parseInt(ch2)];
                res = codesOfStrings(roq2, ans + code2, res);
            }

        }

        return res;
    }

}
