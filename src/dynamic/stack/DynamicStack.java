package dynamic.stack;

public class DynamicStack extends Stack {

    @Override
    public void push(int item) throws Exception {

        if (isFull()){

            // new array with double size
            int[] newStack = new int[data.length * 2];

            // copying old value
            for (int i = tos; i >= 0; i--)
                newStack[i] = data[i];

            // assigning reference
            data = newStack;
        }

        super.push(item);
    }
}
