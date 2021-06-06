package dcb;

import java.util.HashMap;
import java.util.Scanner;

public class ScoreAnalyser {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        scoreAnalyzer(n);

    }

    public static void scoreAnalyzer(int n) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            map.put(name, score);
        }

        String[] res = new String[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String key : map.keySet()) {

            if (map.get(key) > max) {
                max = map.get(key);
                res[1] = key;
            }

            if (map.get(key) < min) {
                min = map.get(key);
                res[0] = key;
            }

        }

        for (String s : res)
            System.out.print(s + " ");

    }

}
