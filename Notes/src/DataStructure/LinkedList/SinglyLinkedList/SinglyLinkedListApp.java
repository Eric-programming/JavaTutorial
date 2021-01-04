package DataStructure.LinkedList.SinglyLinkedList;

/**
 * Singly linked list is a data structure that is a sequence of nodes, and each
 * node points to the next node.
 */
public class SinglyLinkedListApp {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        SinglyLinkedList<Long> sll = new SinglyLinkedList<>();

        System.out.println(sll.isEmpty());// True

        for (int i = 0; i < items.length; i++) {
            sll.insertFirst(items[i]);
        }

        sll.displayList();// display all items in the linkedlist

        sll.deleteFirst(); // Remove 8

        sll.deleteLast();// remove 1

        sll.displayList();

        sll.insertLast(items[2] * 100);// Insert last item

        sll.displayList();

    }
}