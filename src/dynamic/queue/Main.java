package dynamic.queue;

public class Main {
    public static void main(String[] args) throws Exception {

        DynamicQueue q = new DynamicQueue();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);

        q.display();

    }
}
