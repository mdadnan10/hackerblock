package strings;

public class StringCompression {
    public static void main(String[] args) {

        String str = "aaaabbcccddef";
        stringCompress(str);
        stringCompress2(str);

    }

    public static void stringCompress(String str) {

        StringBuffer ans = new StringBuffer();
        ans.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr != prev) {
                ans.append(str.charAt(i));
            }

        }

        System.out.println(ans);

    }

    public static void stringCompress2(String str) {

        StringBuffer ans = new StringBuffer();
        ans.append(str.charAt(0));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count += 1;
            } else {

                if (count > 1) {
                    ans.append(count);
                    count = 1;
                }

                ans.append(curr);

            }

        }

        if (count > 1) {
            ans.append(count);
            count = 1;
        }

        System.out.println(ans);

    }

}
