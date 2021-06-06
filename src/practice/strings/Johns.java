package practice.strings;

public class Johns {
    public static void main(String[] args) {

        String input1 = "aaabccd";
        remove(input1);

    }

    public static void remove(String str) {

        String a = "abc";
        String b = "ac";
        String c = "aaa";

        int min = Math.min(Math.min(a.length(), b.length()), c.length());

        while (str.length() >= min) {

            str = str.replace(a, "");
            str = str.replace(b, "");
            str = str.replace(c, "");


            if (str.length() == min) break;
        }

        System.out.println(str);
        System.out.println(str.length());

    }

}
