package strings;

public class CountTrailingZeros {
    public static void main(String[] args) {

        int n = 100;
        int count = 0;
        while ( n != 0){
            n = n/5;
            count += n;
        }
        System.out.println(count);
    }
}
