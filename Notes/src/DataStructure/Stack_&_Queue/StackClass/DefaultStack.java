package StackClass;

import java.util.Stack;

public class DefaultStack {
    public static void main(String[] args) {
        Stack<Integer> realStack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            realStack.push(i);
        }
        int size = realStack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(realStack.pop());
        }
        System.out.println("Is empty?? => " + realStack.isEmpty());
    }
}
