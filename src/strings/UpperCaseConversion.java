package strings;

import java.util.Locale;

public class UpperCaseConversion {
    public static void main(String[] args) {

        String str = "i love programming";
        transform(str);

    }

    public static void transform(String str){

        String ans = "";

        String[] s = str.split(" ");

        for (String s1 : s) {
            String fl = s1.substring(0, 1).toUpperCase();
            String rl = s1.substring(1);
            ans += fl + rl + " ";
        }

        System.out.println(ans.trim());

    }

}
