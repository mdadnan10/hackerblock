package queue.methods;

public class Queue {
    private int[] data;
    private int front;
    private int size;

    public Queue() {
        data = new int[5];
        front = 0;
        size = 0;
    }

    public Queue(int size) {
        data = new int[size];
        front = 0;
        this.size = 0;
    }

    public void enQueue(int item) throws Exception {
        if (isFull()) throw new Exception("Queue is full");

        int idx = front + size;
        data[idx] = item;
        size++;
    }

    public int deQueue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");

        int value = data[front];

        data[front] = 0;
        front += 1;
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
        return data.length == size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void display() {
        for (int i = front; i < front + size; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
}
