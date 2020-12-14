package QueueClass;

import java.util.LinkedList;
import java.util.Queue;

public class DefaultQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            myQueue.add(i);
        }
        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);
    }
}
