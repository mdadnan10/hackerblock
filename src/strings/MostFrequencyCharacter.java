package strings;

import java.util.Scanner;

public class MostFrequencyCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        maxFrequency(str);
    }

    public static void maxFrequency(String str) {

        int[] arr = new int[256];

        for (int i = 0; i < str.length(); i++){
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        int max = Integer.MIN_VALUE;
        int ch = 0;

        for (int i = 0; i < arr.length; i++){

            if (max < arr[i]) {
                max = arr[i];
                ch = i;
            }

        }

        char cha = (char) ch;
        System.out.println(cha);
    }

}
