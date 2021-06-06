package recursion;

public class AllSubSequence {
    public static void main(String[] args) {

        String str = "ab";
        subSequence(str, "");

    }

    public static void subSequence(String ques, String ans) {

        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String ss = ques.substring(1);

        subSequence(ss, ans + "");
        subSequence(ss, ans + ch);

    }

}
