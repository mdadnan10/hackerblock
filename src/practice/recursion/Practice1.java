package practice.recursion;

public class Practice1 {
    public static void main(String[] args) {

//        PI(5);
//        PD(5);
//        PDI(5);
//        PID(1,5);
//        System.out.println(power(2, 10));
//        System.out.println(fact(5));
//        System.out.println(fibonacci(10));
//        ruler(1, 3);
//        makeLine(2);

    }

    public static void PI(int n) {

        if (n == 0) return;

        PI(n - 1);

        System.out.println(n);

    }

    public static void PD(int n) {

        if (n == 0) return;

        System.out.println(n);

        PD(n - 1);

    }

    public static void PDI(int n) {

        if (n == 0) return;

        System.out.println(n);

        PDI(n - 1);

        System.out.println(n);

    }

    public static void PID(int si, int n) {

        if (n == 0) return;

        System.out.println(si);

        PID(si + 1, n - 1);

        System.out.println(si);

    }

    public static int power(int b, int p) {

        if (p == 0) return 1;

        int res = power(b, p - 1);

        return res * b;
    }

    public static int fact(int n) {

        if (n == 0) return 1;

        int fact = fact(n - 1);

        return fact * n;
    }

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) return n;

        int fb0 = fibonacci(n - 1);
        int fb1 = fibonacci(n - 2);

        return fb0 + fb1;
    }

    public static void ruler(int inch, int mtl) {

        for (int i = 1; i <= mtl; i++)
            System.out.print("- ");
        System.out.println("0");

        for (int i = 1; i <= inch; i++) {

            makeLine(mtl - 1);

            for (int j = 1; j <= mtl; j++)
                System.out.print("- ");
            System.out.println(i);
        }

    }

    public static void makeLine(int tl) {

        if (tl == 0) return;

        // sp problem
        makeLine(tl - 1);

        // self work
        for (int i = 1; i <= tl; i++)
            System.out.print("- ");
        System.out.println();

        // sp
        makeLine(tl - 1);

    }
}
