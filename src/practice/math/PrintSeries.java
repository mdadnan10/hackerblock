package practice.math;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();
        printSeries(n, n1);


    }

    public static void printSeries(int n, int n1) {


        int i = 1;
        int count = n;

        while (count > 0) {

            int series = 3 * i + 2;
            i++;

            if (series % n1 != 0) {
                System.out.println(series);
                count--;
            }

        }

    }

}
