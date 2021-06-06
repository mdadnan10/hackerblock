package practice.recursion.usingArray;

public class PrintFromLastIndex {
    public static void main(String[] args) {

        int[] arr = {10, 30, 20, 40, 50, 80, 60};
        printReverse(arr, 0);

    }

    public static void printReverse(int[] arr, int vidx){

        if (arr.length == vidx) return;

        printReverse(arr, vidx + 1);

        System.out.print(arr[vidx] + " ");

    }

}
