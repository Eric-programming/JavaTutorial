package StackClass;

import java.util.Iterator;

public class LinkedListStack<T> implements IMyStack<T> {

    private Node top = null;
    private int N = 0;

    private class Node {
        T item;
        Node next;
    }

    @Override
    public IMyStack<T> push(T item) {

        Node newTop = new Node();

        newTop.item = item;
        newTop.next = top;

        top = newTop;

        N++;

        return this;
    }

    @Override
    public T pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("stack is empty");
        }

        T item = top.item;

        top = top.next;
        N--;

        return item;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private Node cur = top;

            @Override
            public boolean hasNext() {
                return cur != null;
            }

            @Override
            public T next() {
                T item = cur.item;
                cur = cur.next;
                return item;
            }
        };

    }

    public static void main(String[] args) {
        LinkedListStack<Integer> mLinkedListStack = new LinkedListStack<>();
        mLinkedListStack.push(100);
        mLinkedListStack.push(10);
        mLinkedListStack.push(1);
        Iterator<Integer> iterator = mLinkedListStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
