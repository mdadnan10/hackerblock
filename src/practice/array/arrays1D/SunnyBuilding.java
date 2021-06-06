package practice.array.arrays1D;

public class SunnyBuilding {
    public static void main(String[] args) {

        int[] arr = {1, 4, 8, 2, 9};
        sunny(arr);

    }

    public static void sunny(int[] arr) {

        int count = 1;

        int maxHeight = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxHeight || arr[i] == maxHeight) {
                count++;
                maxHeight = arr[i];
            }

        }
        System.out.println(count);
    }

}
