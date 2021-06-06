package nagarroTest2;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {

        String str = "2+3+2*(5-3*6/2)";
        System.out.println(infixCalculation(str));

    }

    public static int infixCalculation(String str) {

        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                numbers.push(ch - '0');
            } else if (ch == '(') {
                operations.push(ch);
            } else if (ch == ')') {

                while (operations.peek() != '(') {

                    int output = performOperation(numbers, operations);
                    numbers.push(output);
                }

                operations.pop();
            } else if (isOperator(ch)) {

                while (!operations.isEmpty() && precedence(ch) <= precedence(operations.peek())) {

                    int output = performOperation(numbers, operations);
                    numbers.push(output);
                }

                operations.push(ch);

            }

        }

        while (!operations.isEmpty()) {
            int output = performOperation(numbers, operations);
            numbers.push(output);
        }

        return numbers.pop();
    }

    public static int precedence(char ch) {

        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }

        return -1;
    }

    public static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    public static int performOperation(Stack<Integer> numbers, Stack<Character> operations) {

        int a = numbers.pop();
        int b = numbers.pop();
        char operation = operations.pop();
        switch (operation) {

            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;

        }

        return 0;
    }

}
