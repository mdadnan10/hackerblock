//package practice.recursion;
//
//import java.util.ArrayList;
//
//public class AllSubsequencesLexico {
//    public static void main(String[] args) {
//
//        String ques = "ab";
//        subsequences(ques, "");
//
//        for (int i = 0; i < res.size() - 1; i++) {
//
//            for (int j = i + 1; j < res.size(); j++){
//
//                if (res.get(i) > res.get(j))
//
//            }
//
//        }
//
//    }
//
//    static ArrayList<String> res = new ArrayList<>();
//
//    public static void subsequences(String ques, String ans) {
//
//        if (ques.length() == 0) {
//            res.add(ans);
//            return;
//        }
//
//        char ch = ques.charAt(0);
//        String ss = ques.substring(1);
//
//        subsequences(ss, ans);
//        subsequences(ss, ans + ch);
//    }
//
//}
