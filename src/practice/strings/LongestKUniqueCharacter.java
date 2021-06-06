package practice.strings;

public class LongestKUniqueCharacter {
    public static void main(String[] args) {

        String str = "1mb";
        System.out.println(subString(str, 6));

    }

    public static int subString(String str, int k) {

        if (k > str.length()) return -1;

        int ans = 0;
        int i = 0;
        int j = 0;
        int dis = 0;
        int[] freq = new int[26];

        while (j < str.length()) {

            char ch = str.charAt(j);
            if (freq[ch - 97] == 0) dis++;

            freq[ch - 97]++;

            while (dis > k) {

                ch = str.charAt(i);
                freq[ch - 97]--;
                if (freq[ch - 97] == 0) dis--;

                i++;
            }

            ans = Math.max(ans, j - i + 1);
            j++;
        }

        return ans;
    }

}
