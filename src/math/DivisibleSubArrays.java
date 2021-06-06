package math;

import java.util.HashMap;
import java.util.Scanner;

public class DivisibleSubArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {

            int[] arr = takeInput();
            System.out.println(subarraysDivByK(arr));
        }

    }

    public static int[] takeInput() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }

    public static long subarraysDivByK(int[] A) {

        long k = A.length;
        HashMap< Long, Long > map = new HashMap<>();

        map.put(0L, 1L);
        long sum = 0;
        long count = 0;

        for(int a : A){
            sum = (sum + a) % k;

            if(sum < 0){
                sum += k;
            }

            count += map.getOrDefault(sum, 0L);
            map.put(sum, map.getOrDefault(sum, 0L) + 1);
        }

        return count;
    }

}
