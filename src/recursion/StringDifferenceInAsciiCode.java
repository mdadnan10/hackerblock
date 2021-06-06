package recursion;

public class StringDifferenceInAsciiCode {
    public static void main(String[] args) {

        diffInAsciiCode("acb", "");

    }

    public static void diffInAsciiCode(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        char ch1 = ques.charAt(0);
        String ss = ques.substring(1);

        int diff = (int) ch1 - (int) ch;

        diffInAsciiCode(ss, ans + ch + diff );

    }

}
