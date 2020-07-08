package DataStructure.Queue;

// First-In-First-Out
public class QueueApp {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        tryNewQueue(items);
    }

    public static void tryNewQueue(long[] items) {
        QueueClass<Long> q = new QueueClass<Long>(items.length);
        // insert Data
        for (int i = 0; i < items.length; i++) {
            q.enqueue(items[i]);
        }

        // Print the data
        q.printQueue();

        // Add one more data
        q.enqueue(items[3]);// <= Not going to work

        // Remove data
        for (int i = 0; i < items.length; i++) {
            q.dequeue();
        }
        // Remove one more data
        q.dequeue();// <= Not going to work

        q.printQueue();
    }
}