package DataStructure.Queue;

/**
 * Searching O(n)
 * 
 * Delete O(1)
 * 
 * Add O(1)
 */
public class QueueClassUsingLinkedList<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T v) {
            super();
            data = v;
        }
    }

    private int maxSize;
    private Node<T> front;
    private Node<T> back;
    private int currentSize;

    public QueueClassUsingLinkedList(int max) {
        super();
        maxSize = max;
        currentSize = 0;
    }

    public void enqueue(T v) {
        if (isFull()) {
            System.out.println("Sorry we can't enqueue because queue is full!");
        } else {
            Node<T> node = new Node<T>(v);
            if (isEmpty()) {
                front = node;
            }
            if (back != null) {
                back.next = node;
            }
            back = node;
            currentSize += 1;
            System.out.printf("Value %s is inserted \n", v.toString());
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Sorry we can't dequeue because queue is empty");
        } else {
            T temp = front.data;
            if (front.next != null) {
                front = front.next;
            } else {
                front = null;
                back = null;
            }
            currentSize -= 1;
            System.out.printf("Value %s is removed \n", temp.toString());
        }
    }

    public T peek() {
        return front.data;
    }

    public boolean isFull() {
        return currentSize >= maxSize;
    }

    public boolean isEmpty() {
        return front == null && back == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Sorry, there is nothing in the queue");
        } else {
            Node<T> tempNode = front;
            while (tempNode.next != null) {
                System.out.println("print => " + tempNode.data.toString());
                tempNode = tempNode.next;
            }
            System.out.println("print => " + tempNode.data.toString());
        }
    }
}