package practice;

public class LexicoIncreasing {
    public static void main(String[] args) {

        lexicoCounting(0, 1);

    }

    public static void lexicoCounting(int curr, int n) {

        if (Integer.toString(curr).length() > n) return;

        if (Integer.toString(curr).length() == n) {
            System.out.println(curr);
        }

        int i = 0;
        int rem = curr % 10;
        i = rem + 1;

        while (i <= 9) {
            lexicoCounting(curr * 10 + i, n);
            i++;
        }

    }

}
