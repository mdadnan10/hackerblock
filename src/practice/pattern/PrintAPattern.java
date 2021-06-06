package practice.pattern;

public class PrintAPattern {
    public static void main(String[] args) {

        int n = 10;

        int nst = 2 * n - 1;
        int nsp = 0;

        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= nsp; i++)
                System.out.print("_");

            for (int col = 1; col <= nst; col++)
                System.out.print("*");

            for (int i = 1; i <= nsp; i++)
                System.out.print("_");

            System.out.println();
            nst -= 2;
            nsp++;

        }

    }
}
