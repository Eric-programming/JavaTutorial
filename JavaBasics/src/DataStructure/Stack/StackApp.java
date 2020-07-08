package DataStructure.Stack;

import java.util.Stack;

public class StackApp {

    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        // Try out new Stack
        tryNewStack(items);

        // Try Out Default Stack
        // tryDefaultStack(items);
    }

    public static void tryNewStack(long[] items) {
        StackClass s = new StackClass(items.length);
        for (int i = 0; i < items.length; i++) {
            s.push(items[i]);
        }
        s.push(60);// <= this shouldn't be inserated
        s.push(70);// <= this shouldn't be inserated
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void tryDefaultStack(long[] items) {
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