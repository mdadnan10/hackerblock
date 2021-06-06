package practice.strings;

public class CheckTwoStringAreAnagram {
    public static void main(String[] args) {

        String str1 = "wknam";
        String str2 = "teftv";
        System.out.println(anagram(str1, str2));

    }

    public static int anagram(String S1, String S2) {

        if (S1.length() != S2.length()) return 0;

        int[] ch = new int[256];
        int[] ch1 = new int[256];

        for (int i = 0; i < S1.length(); i++)
            ch[S1.charAt(i)] += 1;

        for (int i = 0; i < S2.length(); i++)
            ch1[S2.charAt(i)] += 1;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != ch1[i]) return 0;

        }

        return 1;
    }

}
