package LinkedList.CircularLinkedList;

public class CircularLinkedListApp {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        CircularLinkedList<Long> cll = new CircularLinkedList<>();
        for (int i = 0; i < items.length; i++) {
            cll.insertHead(items[i]);
        }
        cll.displayList();
        cll.deleteHead();
        cll.insertTail(items[2] * 200);
        cll.displayList();

        // Insert Tail
        cll.clearUp();

        for (int i = 0; i < items.length; i++) {
            cll.insertTail(items[i]);
        }
        cll.displayList();
    }
}