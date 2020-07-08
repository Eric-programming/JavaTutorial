package DataStructure.Stack;

/**
 * New StackClass
 */
public class StackClass {
    private int maxSize;
    private long[] stackArray;
    private int top;
    // Optional
    private int empty = -1;

    public StackClass(int size) {
        super();
        maxSize = size;
        stackArray = new long[size];
        top = empty;
    }

    public void push(long v) {
        if (isFull()) {
            System.out.println("Sorry, it is full!");
        } else {
            top += 1;
            stackArray[top] = v;
        }
    }

    public long pop() {
        if (!isEmpty()) {
            long temp = stackArray[top];
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
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == empty;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

}