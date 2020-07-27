package DataStructure.Stack;

import java.util.Stack;

public class StackApp {

    public static void main(String[] args) {
        long[] longArr = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        // New Stack using Array
        // tryNewStackUsingArray(longArr);

        // New Stack using Dynamic Array
        tryNewStackUsingDynamicArray(longArr);

        // Try Out Default Stack
        // tryDefaultStack(longArr);
    }

    public static void tryNewStackUsingDynamicArray(long[] longArr) {
        StackClassUsingDynamicArray demoStackUsingDynamicArr = new StackClassUsingDynamicArray();
        for (int i = 0; i < longArr.length; i++) {
            demoStackUsingDynamicArr.push(longArr[i]);
        }
        demoStackUsingDynamicArr.push(60);// <= this should be inserated because there is no size limit
        demoStackUsingDynamicArr.push(70);// <= this should be inserated because there is no size limit
        while (!demoStackUsingDynamicArr.isEmpty()) {
            System.out.println(demoStackUsingDynamicArr.pop());
        }
    }

    public static void tryNewStackUsingArray(long[] longArr) {
        StackClassUsingArray demoStackUsingArr = new StackClassUsingArray(longArr.length);
        for (int i = 0; i < longArr.length; i++) {
            demoStackUsingArr.push(longArr[i]);
        }
        demoStackUsingArr.push(60);// <= this shouldn't be inserated because the size is full
        demoStackUsingArr.push(70);// <= this shouldn't be inserated because the size is full
        while (!demoStackUsingArr.isEmpty()) {
            System.out.println(demoStackUsingArr.pop());
        }
    }

    public static void tryDefaultStack(long[] longArr) {
        Stack<Long> realStack = new Stack<>();
        for (int i = 0; i < longArr.length; i++) {
            realStack.push(longArr[i]);
        }
        System.out.println(realStack);
        for (int i = 0; i < longArr.length; i++) {
            realStack.pop();
            System.out.println(realStack);
        }
        System.out.println("Is empty?? => " + realStack.isEmpty());
    }
}