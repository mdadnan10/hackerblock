package strings;

public class SumOfNumbersInStrings {
    public static void main(String[] args) {
        String str = "1abc23";
        sum(str);
    }

    public static void sum(String str) {

        int sum = 0;
        String temp = "0";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }

        }

        sum += Integer.parseInt(temp);

        System.out.println(sum);

    }

}
