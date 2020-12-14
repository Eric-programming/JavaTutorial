package StackClass;

import java.util.Iterator;

public class ArrayStack<T> implements IMyStack<T> {

    // Storage
    private T[] a = (T[]) new Object[1];

    // Total items tracker
    private int N = 0;

    @Override
    public IMyStack<T> push(T item) {
        check();
        a[N++] = item;
        return this;
    }

    @Override
    public T pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("stack is empty");
        }

        T item = a[--N];

        check();

        return item;
    }

    private void check() {

        if (N >= a.length) {
            resize(2 * a.length);// expand
        } else if (N > 0 && N <= a.length / 4) {
            resize(a.length / 2);// shrink
        }
    }

    /**
     * Resize the array
     */
    private void resize(int size) {

        T[] tmp = (T[]) new Object[size];

        for (int i = 0; i < N; i++) {
            tmp[i] = a[i];
        }

        a = tmp;
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

        // Iterate the entire stack in order
        return new Iterator<T>() {

            private int i = N;

            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                return a[--i];
            }
        };
    }

    public static void main(String[] args) {
        ArrayStack<Integer> mArrayStack = new ArrayStack<>();
        mArrayStack.push(100);
        mArrayStack.push(10);
        mArrayStack.push(1);
        Iterator<Integer> iterator = mArrayStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        try {
            mArrayStack.pop();
            mArrayStack.pop();
            mArrayStack.pop();
            mArrayStack.pop();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
