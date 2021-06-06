package hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Intersection {
    public static void main(String[] args) {


        int[] one = {10, 20, 50, 5, 60, 20, 50, 50, 3, 50, 10};
        int[] two = {2, 10, 70, 10, 50, 5, 80, 3, 1, 3, 50};
        interSection(one, two);

    }

    public static void interSection(int[] one, int[] two) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int key : one) {
            int count = map.getOrDefault(key, 0) + 1;
            map.put(key, count);
        }

        for (int key : two){

            if (map.containsKey(key)){
                intersection.add(key);
                map.remove(key);
            }

        }

        Collections.sort(intersection);
        System.out.println(intersection);
    }
}
