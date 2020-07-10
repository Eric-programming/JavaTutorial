package DataStructure.LinkedList.DoublyLinkedList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        DoublyLinkedList<Long> dll = new DoublyLinkedList<>();
        System.out.println(dll.isEmpty());// True
        // Insert to Head
        for (int i = 0; i < items.length; i++) {
            dll.insertHead(items[i]);
        }
        dll.displayList();// Display

        dll.deleteHead();// Delete head
        dll.displayList();// Display

        dll.insertTail(items[2] * 800);// Insert Tail
        dll.displayList();// Display

        dll.deleteTail();// Delete Tail
        dll.displayList();// Display

        dll.insertAfter(items[3], items[3] * 100);// Insert after a node
        dll.displayList();// Display

        dll.deleteNodeWithKey(items[3]);// Delete a node with key
        dll.displayList();// Display

        dll.deleteNodeWithKey(items[0]);// Delete a node with key
        dll.displayList();// Display

        dll.deleteNodeWithKey(items[6]);// Delete a node with key
        dll.displayList();// Display
    }
}