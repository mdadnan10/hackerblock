package nagarroTest2;

public class StringDecoding {
    public static void main(String[] args) {

        String s = "a1b2c3";
        System.out.println(decode(s, 5));

    }

    public static String decode(String str, int k) {

        StringBuilder decode = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {

                char ch = str.charAt(i);
                int occurrence = str.charAt(i + 1) - '0';

                for (int j = 1; j <= occurrence; j++) {
                    decode.append(ch);
                }

            }

        }

        if (decode.length() < k)
            return "-1";
        else return decode.substring(k - 1, k);
    }

}
