package DataStructure.Stack;

import java.util.ArrayList;

public class StackClassUsingDynamicArray {
    private ArrayList<Long> stackDynamicArray;
    private int top;
    // Optional
    private int empty = -1;

    public StackClassUsingDynamicArray() {
        super();
        stackDynamicArray = new ArrayList<>();
        top = empty;
    }

    public void push(long value) {
        top += 1;
        stackDynamicArray.add(value);
    }

    public long pop() {
        if (!isEmpty()) {
            long temp = stackDynamicArray.get(top);
            top -= 1;
            return temp;
        } else {
            return empty;
        }
    }

    public long peak() {
        if (isEmpty()) {
            return empty;
        } else {
            return stackDynamicArray.get(top);
        }
    }

    public boolean isEmpty() {
        return top == empty;
    }
}