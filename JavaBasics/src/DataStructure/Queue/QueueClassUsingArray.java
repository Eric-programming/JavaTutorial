package DataStructure.Queue;

import java.util.Arrays;

public class QueueClassUsingArray {
    private int maxSize;
    private int currentSize;
    private Long[] arr;

    public QueueClassUsingArray(int max) {
        super();
        maxSize = max;
        arr = new Long[max];
        currentSize = 0;
    }

    public void enqueue(Long v) {
        if (isFull()) {
            System.out.println("Sorry we can't enqueue because queue is full!");
        } else {
            arr[currentSize] = v;
            currentSize++;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Sorry we can't dequeue because queue is empty");
        } else {
            for (int i = 1; i < currentSize; i++) {
                arr[i - 1] = arr[i];
            }
            currentSize -= 1;
            arr[currentSize] = null;
        }
    }

    public Long peek() {
        return arr[0];
    }

    public boolean isFull() {
        return currentSize >= maxSize;
    }

    public boolean isEmpty() {
        return arr[0] == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Can't print because Queue is empty");
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }
}