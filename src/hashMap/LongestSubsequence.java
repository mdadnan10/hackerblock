package hashMap;

import java.util.HashMap;

public class LongestSubsequence {
    public static void main(String[] args) {

        int[] arr = {2, 12, 9, 16, 7, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        longestSubsequence(arr);

    }

    private static void longestSubsequence(int[] arr) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int key : arr) {
            if (map.containsKey(key - 1))
                map.put(key, false);
            else {
                map.put(key, true);
            }

            if (map.containsKey(key + 1)) {
                map.put(key + 1, false);
            }
        }


        int max = 0;
        int sp = 0;
        for (Integer key : map.keySet()){
            if (map.get(key)){

                int count = 0;
                while (map.containsKey(key + count))
                    count++;

                if (count > max){
                    max = count;
                    sp = key;
                }

            }
        }

        for (int i = 0; i < max; i++)
            System.out.print(sp + i + " ");

    }
}
