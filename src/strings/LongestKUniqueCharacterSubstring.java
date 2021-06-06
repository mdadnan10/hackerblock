package strings;

import java.util.Scanner;

public class LongestKUniqueCharacterSubstring {
    public static void main(String[] args) {

        String str = "aaaa";
        int k = 1;

    }

//    public static int kUnique(String str, int k) {
//
//
//    }

}

class K_unique_Substring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            String str = sc.next();
            int k = sc.nextInt();

            System.out.println(longestKUniqueChar(str, k));

        }

    }

    public static int longestKUniqueChar(String str, int k) {

        int ans = 0;

        int i = 0;
        int j = 0;

        int dis = 0;

        int[] freq = new int[26];

        while (j < str.length()) {

            char ch = str.charAt(j);

            if (freq[ch - 97] == 0) {
                dis++;
            }

            freq[ch - 97]++;

            while (dis > k) {

                ch = str.charAt(i);
                freq[ch - 97]--;

                if (freq[ch - 97] == 0) {
                    dis--;
                }

                i++;
            }

            ans = Math.max(ans, j - i + 1);

            j++;
        }

        if (k > str.length()) return -1;
        else return ans;
    }

}

