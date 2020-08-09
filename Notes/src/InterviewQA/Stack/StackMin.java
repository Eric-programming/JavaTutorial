package InterviewQA.Stack;

import java.util.Stack;

/**
 * Design a Data Structure SpecialStack that supports all the stack operations
 * like push(), pop(), isEmpty() and an additional operation getMin() which
 * should return minimum element from the SpecialStack. All these operations of
 * SpecialStack must be O(1). To implement SpecialStack, you should only use
 * standard Stack data structure and no other data structure like arrays, list,
 * .. etc.
 * 
 * 7,1,2,3,0
 * 
 * minStack:
 * 
 * MainStack:
 */

/**
 * StackMin
 */
public class StackMin extends Stack<Integer> {
    private Stack<Integer> minStack;

    public StackMin() {
        super();
        minStack = new Stack<>();
    }

    public void push(int value) {
        if (minStack.isEmpty() || minStack.peek() > value) {
            minStack.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        if (super.isEmpty())
            return null;
        if (minStack.peek() == super.peek()) {
            minStack.pop();
        }
        return super.pop();
    }

    public Integer getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        StackMin minStack = new StackMin();
        int[] arr = { 7, 1, 2, 3, 0 };

        for (int i = 0; i < arr.length; i++) {
            minStack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(minStack.getMin());
            minStack.pop();
        }
        System.out.println(minStack.isEmpty());
    }
}