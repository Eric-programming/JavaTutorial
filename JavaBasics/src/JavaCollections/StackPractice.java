package JavaCollections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        Stack<Long> oldStack = new Stack<>();
        for (int i = 0; i < items.length; i++) {
            oldStack.push(items[i]);
        }
        System.out.printf("the size of the stack is %d", oldStack.size());
        System.out.println();
        while (!oldStack.isEmpty()) {
            System.out.println(oldStack.pop());
        }
    }
}