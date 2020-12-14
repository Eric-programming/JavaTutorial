package QueueClass;

import java.util.Iterator;

public class LinkedListQueue<T> implements IMyQueue<T> {

    private Node first;
    private Node last;
    int N = 0;

    private class Node {
        T item;
        Node next;
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
    public IMyQueue<T> add(T item) {

        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        /**
         * 1=> 2=> 3=>null f l
         */
        if (isEmpty()) {
            last = newNode;
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        N++;
        return this;
    }

    @Override
    public T remove() throws Exception {

        if (isEmpty()) {
            throw new Exception("queue is empty");
        }

        Node node = first;
        first = first.next;
        N--;

        if (isEmpty()) {
            last = null;
        }

        return node.item;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            Node cur = first;

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
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.add(300);
        queue.add(30);
        queue.add(3);
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
