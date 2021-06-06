package practice.math;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = 0;
            int n1 = 0;

            char ch = sc.next().charAt(0);


            if (ch == 'x' || ch == 'X')
                break;

            if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '%') {
                n = sc.nextInt();
                n1 = sc.nextInt();
            } else {
                System.out.println("Invalid operation. Try again.");
            }

            switch (ch) {

                case '*': {
                    int mult = n * n1;
                    System.out.println(mult);
                    break;
                }

                case '/': {
                    int div = n / n1;
                    System.out.println(div);
                    break;
                }

                case '+': {
                    int addition = n + n1;
                    System.out.println(addition);
                    break;
                }

                case '-': {
                    int diff = n - n1;
                    System.out.println(diff);
                    break;
                }

                case '%': {
                    int mod = n % n1;
                    System.out.println(mod);
                    break;
                }
            }
        }

    }
}
