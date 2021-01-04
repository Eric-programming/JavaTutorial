package DataStructure.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * PriorityQueue
 * 
 * We use PriorityQueue if we want the objects to be access based on their
 * priority. All elements in the priority queue are ordered according to the
 * ordering, or by a Comparator in construction time, depending on which
 * constructor is used.
 */
public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq;
        // pq = new PriorityQueue<>();
        // pq = new PriorityQueue<>(Arrays.asList(new Integer[] { 2, 20, 200, 2000 }));

        // Creates a PriorityQueue with initial capacity that orders based on comparator
        pq = new PriorityQueue<>(10, (a, b) -> Integer.compare(b, a));

        // Adding items to the pq using add()
        pq.add(200);
        pq.add(20);
        pq.add(2);
        pq.add(2000);
        pq.add(20000);

        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());// 2

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.peek());

        // Print PriorityQueue
        System.out.println(pq);

        // Iterate PriorityQueue
        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}