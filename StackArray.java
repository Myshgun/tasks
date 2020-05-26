import java.util.ArrayList;

public class StackArray {

    private ArrayList<String> a;

    public StackArray() {
        a = new ArrayList();
    }

    public void push(String x) {
        a.add(x);
    }

    public String pop() {
        String lifo;
        lifo = a.remove((a.size() - 1));
        return (lifo);
    }

    public boolean isEmpty() {
        return a.isEmpty();
    }

    public String peek() {
        return (a.get(a.size() - 1));
    }

}

public class QueueStacks {

    private StackArray inputStack;
    private StackArray outputStack;

    public QueueStacks() {
        inputStack = new StackArray();
        outputStack = new StackArray();
    }

    public void enqueue(String entry) {
        inputStack.push(entry);
    }

    public String dequeue() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

}