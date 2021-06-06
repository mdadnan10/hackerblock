package practice.recursion.usingArray;

public class SearchLastValueInArray {
    public static void main(String[] args) {

        int[] arr = {10, 30, 40, 20, 30, 60, 10};
        System.out.println(searchLastOccurrence(arr, 10, 0));

    }

    public static int searchLastOccurrence(int[] arr, int item, int vidx) {

        if (arr.length == vidx) return -1;

        int val = searchLastOccurrence(arr, item, vidx + 1);

        if (arr[vidx] == item && val == -1)
            return vidx;

        return val;
    }

}
