package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

// First-In-First-Out
public class QueueApp {
    public static void main(String[] args) {
        long[] longArr = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        // useQueueArrayClass(longArr);
        // useQueueLinkedList(longArr);
        useDefaultQueue(longArr);

    }

    public static void useQueueArrayClass(long[] arr) {
        QueueClassUsingArray queueArr = new QueueClassUsingArray(arr.length);
        for (int i = 0; i < arr.length; i++) {
            queueArr.enqueue(arr[i]);
        }
        queueArr.printQueue();
        System.out.println("Peek => " + queueArr.peek());
        for (int i = 0; i < arr.length; i++) {
            queueArr.dequeue();
            queueArr.printQueue();
        }
    }

    public static void useQueueLinkedList(long[] longArr) {
        QueueClassUsingLinkedList<Long> q = new QueueClassUsingLinkedList<Long>(longArr.length);
        // insert Data
        for (int i = 0; i < longArr.length; i++) {
            q.enqueue(longArr[i]);
        }

        // Print the data
        q.printQueue();

        // Add one more data
        q.enqueue(longArr[3]);// <= Not going to work

        // Remove data
        for (int i = 0; i < longArr.length; i++) {
            q.dequeue();
        }
        // Remove one more data
        q.dequeue();// <= Not going to work

        q.printQueue();
    }

    public static void useDefaultQueue(long[] longArr) {
        Queue<Long> myQueue = new LinkedList<>();

        for (int i = 0; i < longArr.length; i++) {
            myQueue.add(longArr[i]);
        }
        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);
    }
}