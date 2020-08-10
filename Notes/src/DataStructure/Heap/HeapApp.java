package DataStructure.Heap;

/**
 * Heap or Binary heap has min heap and max heap. Min heap basically means that
 * each node is smaller than its children. Max heap means that each node is
 * bigger than its children
 */
public class HeapApp {
    public static void main(String[] args) {
        int length = 5;
        MaxHeap mh = new MaxHeap(length);
        for (int i = 0; i < length; i++) {
            mh.insert(i);

        }
        System.out.println("/////////////////////////////////");
        mh.printMaxHeap();
        /**
         * 43102
         */
        System.out.println("/////////////////////////////////");
        mh.delete();// delete max value
        mh.printMaxHeap();
        /**
         * 3 2 1 0
         */

    }
}