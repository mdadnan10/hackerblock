package practice.recursion.usingArray;

public class AllOccurrenceIndex {
    public static void main(String[] args) {

        int[] arr = {10, 30, 20, 30, 50, 40, 30, 70, 30};
        int[] res = allIndexOccurrence(arr, 30, 0, 0);

        for (int val : res)
            System.out.print(val + " ");

    }

    public static int[] allIndexOccurrence(int[] arr, int item, int vidx, int count) {

        if (arr.length == vidx) {
            return new int[count];
        }

        if (arr[vidx] == item) {
            int[] res = allIndexOccurrence(arr, item, vidx + 1, count + 1);
            res[count] = vidx;
            return res;
        } else {
            return allIndexOccurrence(arr, item, vidx + 1, count);
        }

    }


}
