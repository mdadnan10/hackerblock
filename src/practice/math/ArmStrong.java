package practice.math;

public class ArmStrong {
    public static void main(String[] args) {

        int num = 370;
        arm(num);
    }

    public static String arm(int input1) {

        int count = 0;
        int temp = input1;
        int check = input1;

        while (temp > 0) {

            int rem = temp % 10;
            temp /= 10;
            count++;
        }

        int res = 0;

        while (input1 > 0) {

            int rem = input1 % 10;
            res = res + (int) Math.pow(rem, count);
            input1 /= 10;

        }

        if (check == res)
            return "Yes";
        else return "No";
    }

    public static String isArmStrong(int input1) {

        int count = 0;
        int temp = input1;
        int num = input1;

        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            count++;
        }

        int res = 0;

        while (num > 0) {

            int rem = num % 10;
            res = res + (int) Math.pow(rem, count);
            num /= 10;

        }

        if (input1 == res)
            return "Yes";
        else return "No";
    }

}
