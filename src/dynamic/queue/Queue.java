package dynamic.queue;

public class Queue {
    protected int[] data;
    protected int front;
    protected int size;

    public Queue() {
        data = new int[5];
        front = 0;
        size = 0;
    }

    public Queue(int cap) {
        data = new int[cap];
        front = 0;
        size = 0;
    }

    public void enqueue(int item) throws Exception {
        if (isFull()) throw new Exception("Queue is Full");

        int idx = (front + size) % data.length;
        data[idx] = item;
        size += 1;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");

        int value = data[front];

        data[front] = 0;
        front = (front + 1) % data.length;
        size -= 1;

        return value;
    }

    public int getFront() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");
        return data[front];
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return data.length == size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void display() {
        for (int i = 0; i < size(); i++) {
            int idx = (i + front) % data.length;
            System.out.print(data[idx] + " ");
        }
        System.out.println();
    }
}
