//package practice.array.arrays1D;
//
//public class MinimumJumsRequired {
//    public static void main(String[] args) {
//
//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
//
//    }
//
//    public static int minimumJumps(int[] arr) {
//
//        int n = arr.length;
//        int jumps = 0;
//
//        int i = 0;
//        while (i < n) {
//
//            int steps = arr[i];
//            int remLen = n - steps;
//
//            if (steps == 1) {
//                i++;
//                jumps++;
//            } else if (steps == 0) {
//                return Integer.MAX_VALUE;
//            } else {
//
//            }
//
//            return jumps;
//        }
//
//    }
//
//}
