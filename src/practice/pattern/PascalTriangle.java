package practice.pattern;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        pascalTriangle(n);
//        pascalTriangle1(n);
        pTriangle(n);


    }

    public static void pascalTriangle(int n) {

        for (int row = 0; row < n; row++) {

            // calculate row fact
            int rowFact = 1;
            for (int fact = row; fact >= 1; fact--)
                rowFact = rowFact * fact;

            // work
            for (int col = 0; col <= row; col++) {

                // calculate col fact
                int colFact = 1;
                for (int fact = col; fact >= 1; fact--)
                    colFact = colFact * fact;

                // cell fact
                int cellFact = 1;
                for (int cell = row - col; cell >= 1; cell--)
                    cellFact = cellFact * cell;

                int value = rowFact / (colFact * cellFact);
                System.out.print(value + "\t");

            }

            // update
            System.out.println();
        }

    }

    public static void pascalTriangle1(int n) {

        int nsp = n - 1;
        int nst = 1;

        for (int row = 0; row < n; row++) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            // calculate row fact
            int rowFact = 1;
            for (int fact = row; fact >= 1; fact--)
                rowFact = rowFact * fact;

            // work
            for (int col = 0; col <= nst; col++) {

                // calculate col fact
                int colFact = 1;
                for (int fact = col; fact >= 1; fact--)
                    colFact = colFact * fact;

                // cell fact
                int cellFact = 1;
                for (int cell = row - col; cell >= 1; cell--)
                    cellFact = cellFact * cell;

                int value = rowFact / (colFact * cellFact);
                System.out.print(value + "\t");

            }

            // update
            System.out.println();
            nsp--;
            nst += 2;
        }

    }

    public static void pTriangle(int n) {

        int nsp = n - 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            int num = 1; // starting number

            // work values
            for (int j = 1; j <= nst; j++) {

                if (j == 1)
                    System.out.print(j + " ");
                else {
                    num = num * (i - j + 1) / (j - 1); // update number
                    System.out.print(num + " ");
                }

            }

            System.out.println();
            nsp--;
            nst += 2;
        }

    }

}
