package practice450.stack;

import java.util.Stack;

public class ReverseAstring {
    public static void main(String[] args) {

        String str = "GeeksforGeeks";

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++)
            s.push(str.charAt(i));

        StringBuffer ans = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = s.pop();
            ans.append(ch);
        }

        System.out.println(ans.toString());
    }

}
