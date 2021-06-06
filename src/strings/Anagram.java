package strings;

public class Anagram {
    public static void main(String[] args) {

        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";

        System.out.println(anagram(a, b));

    }

    public static boolean anagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        int[] cha = new int[256];
        int[] chb = new int[256];

        for (int i = 0; i < a.length(); i++) {
            cha[a.charAt(i)] += 1;
        }

        for (int i = 0; i < b.length(); i++) {
            chb[b.charAt(i)] += 1;
        }

        for (int i = 0; i < cha.length; i++) {

            if (cha[i] != chb[i])
                return false;

        }

        return true;
    }
}
