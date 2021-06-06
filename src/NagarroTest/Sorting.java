package NagarroTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] arr = {30, 12, 14, 16, 40, 49, 97, 33, 19, 5};
        Arrays.sort(arr);
        sorting(arr);

    }

    public static void sorting(int[] arr) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int[] res = new int[arr.length];

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0)
                even.add(arr[i]);
            else odd.add(arr[i]);

        }

        int o = 0;
        int e = 0;
        if (min % 2 == 0) {
            for (int a = 0; a < res.length; a++){

                if (a % 2  == 0){
                    res[a] = even.get(e);
                    e++;
                }
                else {
                    res[a] = odd.get(o);
                    o++;
                }

            }
        }
        else {

            for (int a = 0; a < res.length; a++){

                if (a % 2  == 0){
                    res[a] = odd.get(o);
                    o++;
                }
                else{
                    res[a] = even.get(e);
                    e++;
                }

            }

        }

        for (int val : res)
            System.out.print(val + " ");

    }

}
