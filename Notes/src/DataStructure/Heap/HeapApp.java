package DataStructure.Heap;

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