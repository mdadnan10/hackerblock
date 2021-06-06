package practice.strings;

import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        swapCase(str);

    }

    public static void swapCase(String str){

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++){

            if (Character.isUpperCase(str.charAt(i))){
                ans.append(Character.toLowerCase(str.charAt(i)));
            }

            if (Character.isLowerCase(str.charAt(i))){
                ans.append(Character.toUpperCase(str.charAt(i)));
            }

        }

        System.out.println(ans);
    }
}
