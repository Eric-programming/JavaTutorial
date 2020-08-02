package DataStructure.Stack;

import java.util.LinkedList;

public class StackClassUsingLinkedList {
    private LinkedList<Long> stackLinkedList;
    private int top;
    // Optional
    private int empty = -1;

    public StackClassUsingLinkedList() {
        super();
        stackLinkedList = new LinkedList<>();
        top = empty;
    }

    public void push(long value) {
        top += 1;
        stackLinkedList.add(value);
    }

    public long pop() {
        if (!isEmpty()) {
            long topValue = stackLinkedList.get(top);
            top -= 1;
            return topValue;
        } else {
            return empty;
        }
    }

    public long peak() {
        if (isEmpty()) {
            return empty;
        } else {
            return stackLinkedList.get(top);
        }
    }

    public boolean isEmpty() {
        return top == empty;
    }
}