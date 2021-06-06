package dynamic.stack;

import dynamic.queue.DynamicQueue;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        DynamicStack ds = new DynamicStack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);

        ds.display();
//        displayReverse(ds);
//        System.out.println();
//        reverse(ds, 0, ds.size() - 1, new int[ds.size()]);
        actualReverse(ds, new DynamicStack());
        ds.display();

    }

    public static void displayReverse(DynamicStack s) throws Exception {

        if (s.isEmpty())
            return;

        int item = s.pop();
        displayReverse(s);
        System.out.print(item + " ");
        s.push(item);

    }

    public static void reverse(DynamicStack s, int idx, int vidx, int[] arr) throws Exception {

        if (s.isEmpty())
            return;

        int item = s.pop();
        arr[idx] = item;
        reverse(s, idx + 1, vidx - 1, arr);
        s.push(arr[vidx]);

    }

    public static void actualReverse(DynamicStack s, DynamicStack helper) throws Exception {

        if (s.isEmpty()) {
            actualReverse2(s, helper);
            return;
        }

        int item = s.pop();
        helper.push(item);
        actualReverse(s, helper);

    }

    private static void actualReverse2(DynamicStack s, DynamicStack helper) throws Exception {

        if (helper.isEmpty())
            return;

        int item = helper.pop();
        actualReverse2(s, helper);
        s.push(item);

    }

}
