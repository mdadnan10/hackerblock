package strings;

public class LongestPrefix {
    public static void main(String[] args) {

        String[] str = {"aaaab", "bba", "bbaab", "aaaa"};
        longestCP(str);
    }

    public static void longestCP(String[] str) {

        String temp = "";
        String res = "";

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(0) == str[i].charAt(j)) {
                        temp += str[i].charAt(j);
                } else {
                    res = temp;
                    temp = "";
                    break;
                }
            }

        }

        System.out.println(temp);

    }

}
