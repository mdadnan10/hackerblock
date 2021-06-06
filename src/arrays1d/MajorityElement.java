package arrays1d;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {3, 1, 3, 3, 2};
        majority(arr);

    }

    public static void majority(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            int p = map.getOrDefault(num, 0) + 1;

            map.put(num, p);

        }

        int num = -1;
        int max = Integer.MIN_VALUE;

        for (Integer key : map.keySet()) {

            int c = map.get(key);

            if (c > max){
                num = key;
                max = c;
            }

        }


        if (max > arr.length / 2)
            System.out.println(num);
        else System.out.println(-1);;
    }

}
