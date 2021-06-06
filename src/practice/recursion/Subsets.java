package practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        subsets(arr, 0, new ArrayList<>(), ans);
//        System.out.println(ans);
//        subsetsAns(arr, 0, "");
        userRespect(arr, 0, "");

    }

    public static void subsets(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> ans) {

        if (arr.length == vidx) {
            ans.add(new ArrayList<>(temp));
            return;
        }


        subsets(arr, vidx + 1, temp, ans);
        temp.add(arr[vidx]);
        subsets(arr, vidx + 1, temp, ans);
        temp.remove(temp.size() - 1);

    }

    public static void subsetsAns(int[] arr, int vidx, String ans) {

        if (arr.length == vidx) {
            System.out.println(ans);
            return;
        }

        subsetsAns(arr, vidx + 1, ans + arr[vidx]);
        subsetsAns(arr, vidx + 1, ans);

    }

    public static void userRespect(int[] arr, int vidx, String ans) {

        System.out.println(ans);

        for (int i = vidx; i < arr.length; i++)
            userRespect(arr, i + 1, ans + arr[i]);

    }

}
