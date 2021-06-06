package dynamic.queue;

public class DynamicQueue extends Queue {
    @Override
    public void enqueue(int item) throws Exception {

        if (isFull()) {

            int[] newQueue = new int[data.length * 2];

            for (int i = 0; i < size(); i++) {
                int idx = (i + front) % data.length;
                newQueue[i] = data[idx];
            }

            data = newQueue;
            front = 0;
        }

        super.enqueue(item);
    }
}
