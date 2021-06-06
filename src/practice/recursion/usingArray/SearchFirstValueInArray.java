package practice.recursion.usingArray;

public class SearchFirstValueInArray {
    public static void main(String[] args) {

        int[] arr = {10, 30, 20, 50, 30, 60, 70};
        System.out.println(search(arr, 30, 0));

    }

    public static int search(int[] arr, int item, int vidx) {

        if (arr.length == vidx) return -1;

        if (arr[vidx] == item)
            return vidx;

        return search(arr, item, vidx + 1);
    }

}
