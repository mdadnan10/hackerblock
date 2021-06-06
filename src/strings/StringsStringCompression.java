package strings;

import java.util.Scanner;

public class StringsStringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "abbccdd";
//        compression(str);
        compress(str);

    }

    public static void compression(String str) {

        int[] arr = new int[256];

        for (int j = 0; j < str.length() - 1; j++) {
            if (str.charAt(j) == str.charAt(j + 1))
                System.out.print(str.charAt(j));
//                    arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                if (arr[i] > 1)
                    System.out.print((char) i + "" + arr[i]);
                if (arr[i] == 1)
                    System.out.print((char) i);
            }

        }
    }

    public static void compress(String str) {

        int count = 1;
        String res = "";

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                res += str.charAt(i);
                if (count != 1)
                    res += count;
                count = 1;
            }
            if (i == str.length() - 2) {
                res += str.charAt(i + 1);
                if (count != 1)
                    res += count;
            }

        }

        System.out.println(res);

    }

}
