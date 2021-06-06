package dynamic.stack;

public class Stack {
    protected int[] data;
    protected int tos;

    public Stack() {
        data = new int[5];
        tos = -1;
    }

    public Stack(int cap) {
        data = new int[cap];
        tos = -1;
    }

    public void push(int item) throws Exception {
        if (isFull()) throw new Exception("Stack is Full");

        tos += 1;
        data[tos] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty");

        int value = data[tos];

        data[tos] = 0;
        tos -= 1;

        return value;
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty");
        return data[tos];
    }

    public int size() {
        return tos + 1;
    }

    public boolean isFull() {
        return data.length == size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void display() {
        for (int i = tos; i >= 0; i--)
            System.out.print(data[i] + " ");
        System.out.println();
    }
}
