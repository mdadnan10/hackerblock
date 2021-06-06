package stackAndQueue;

import java.util.*;

public class HoodiesAtCodingBlocks {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int q = scn.nextInt();
        Queue q1 = new Queue(q);
        Queue q2 = new Queue(q);
        Queue q3 = new Queue(q);
        Queue q4 = new Queue(q);
        Queue group_order = new Queue();
        boolean isOne = false, isTwo = false, isThree = false, isFour = false;

        for (int k = 0; k < q; k++) {
            String ch;
            ch = scn.next();
            if (ch.charAt(0) == 'E') {

                int x = scn.nextInt();
                int y = scn.nextInt();
                if (x == 1) {
                    q1.enqueue(y);

                    if (!isOne) {
                        group_order.enqueue(1);
                        isOne = true;
                    }

                } else if (x == 2) {
                    q2.enqueue(y);

                    if (!isTwo) {
                        group_order.enqueue(2);
                        isTwo = true;
                    }

                } else if (x == 3) {
                    q3.enqueue(y);

                    if (!isThree) {
                        group_order.enqueue(3);
                        isThree = true;
                    }

                } else {
                    q4.enqueue(y);

                    if (!isFour) {
                        group_order.enqueue(4);
                        isFour = true;
                    }
                }

            }
            if (ch.charAt(0) == 'D') {
                int front = group_order.front();
                if (front == 1) {

                    if (!q1.isEmpty()) {
                        System.out.println(1 + " " + q1.front());
                        q1.dequeue();
                    }

                    if (q1.isEmpty()) {
                        group_order.dequeue();
                        isOne = false;
                    }

                } else if (front == 2) {

                    if (!q2.isEmpty()) {
                        System.out.println(2 + " " + q2.front());
                        q2.dequeue();
                    }

                    if (q2.isEmpty()) {
                        group_order.dequeue();
                        isTwo = false;
                    }

                } else if (front == 3) {

                    if (!q3.isEmpty()) {
                        System.out.println(3 + " " + q3.front());
                        q3.dequeue();

                    }
                    if (q3.isEmpty()) {
                        group_order.dequeue();
                        isThree = false;
                    }

                } else {

                    if (!q4.isEmpty()) {
                        System.out.println(4 + " " + q4.front());
                        q4.dequeue();
                    }

                    if (q4.isEmpty()) {
                        group_order.dequeue();
                        isFour = false;

                    }

                }
            }
        }
    }
}

class Queue {

    protected int size;

    protected int front;
    protected int[] data;

    public Queue() {
        this.size = 0;
        this.front = 0;
        this.data = new int[5];
    }

    public Queue(int cap) {
        this.size = 0;
        this.front = 0;
        this.data = new int[cap];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) throws Exception {
        if (this.size() == this.data.length) {
            int[] oa = this.data;
            int[] na = new int[oa.length * 2];
            for (int i = 0; i < this.size(); i++) {
                int idx = (i + front) % oa.length;
                na[i] = oa[idx];
            }

            this.data = na;
            this.front = 0;
        }

        // if (this.size == this.data.length) {
        // throw new Exception("queue is full");
        // }

        this.data[(front + size) % this.data.length] = item;
        size++;

    }

    public int dequeue() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");

        }

        int rv = this.data[front];
        front = (front + 1) % this.data.length;
        size--;

        return rv;

    }

    public int getFront() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");
        }

        int rv = this.data[front];

        return rv;
    }

    public void display() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            int idx = (i + front) % this.data.length;
            System.out.print(this.data[idx] + " ");
        }
        System.out.print("END");
    }

    public int front() {
        return data[front];
    }

}
