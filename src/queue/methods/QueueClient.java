package queue.methods;

public class QueueClient {
    public static void main(String[] args) throws Exception {

        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.enQueue(40);
        q.enQueue(50);
        q.deQueue();
        q.deQueue();

        q.display();

    }
}
