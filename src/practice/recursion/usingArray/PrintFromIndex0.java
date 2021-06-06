package practice.recursion.usingArray;

public class PrintFromIndex0 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 60, 20, 5, 70};
        printArray(arr, 0);

    }

    public static void printArray(int[] arr, int vidx){

        if (arr.length == vidx) return;

        System.out.print(arr[vidx] + " ");

        printArray(arr, vidx + 1);

    }

}
