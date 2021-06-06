package queue.methods;

import java.util.*;

public class TheQueueGame {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int n = sc.nextInt();

        for (int t = 1; t <= tc; t++) {
            Queue1 queue = new Queue1(n);

            for (int i = 0; i < n; i++)
                queue.enqueue(sc.nextInt());

            if (queue.validOperation())
                System.out.println("Valid");
            else System.out.println("Invalid");
        }

    }
}

class Queue1 {
    private int[] data;
    private int front;
    private int size;

    public Queue1() {
        data = new int[5];
        front = 0;
        size = 0;
    }

    public Queue1(int cap) {
        data = new int[cap];
        front = 0;
        size = 0;
    }

    public void enqueue(int item) throws Exception {
        if (isFull()) throw new Exception("Queue is full");

        int idx = (front + size) % data.length;
        data[idx] = item;
        size += 1;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");

        int value = data[front];

        data[front] = 0;

        front = (front + 1) % data.length;
        size += 1;

        return value;
    }

    public int size() {
        return size;
    }

    public int getFront() throws Exception {
        if (isEmpty()) throw new Exception("Queue is Empty");
        return data[front];
    }

    public boolean isFull() {
        return data.length == size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean validOperation() {

        int ones = 0;

        for (int i = 0; i < size(); i++) {
            int idx = (i + front) % data.length;
            if (data[idx] == 1)
                ones += 1;
            else ones -= 1;

            if (ones < 0) return false;
        }

        return true;
    }
}
