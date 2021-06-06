package recursion;

public class Palindrome {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1};
        isPalindrome(arr, 0, 0, 0, arr.length - 1);

    }

    public static void isPalindrome(int[] arr, int first, int last, int idxS, int idxE) {

        if (idxS > idxE) {
            System.out.println(idxS + " " + idxE);
            return;
        }

        System.out.println(first);

        isPalindrome(arr, arr[idxS], arr[idxE], idxS + 1, idxE - 1);

        System.out.println(last);

    }

}
