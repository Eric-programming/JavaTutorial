package DataStructure.LinkedList;

public class SinglyLinkedList<T> {
    private NodeClass<T> firstNode;

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void insertFirst(T v) {
        NodeClass<T> n = new NodeClass<>(v);
        n.setNext(firstNode);
        firstNode = n;
        System.out.println(v.toString() + " is inserted");
    }

    public void deleteFirst() {
        NodeClass<T> tempNode = firstNode;
        firstNode = firstNode.getNext();
        System.out.println(tempNode.getData().toString() + " is removed");
    }

    public void displayList() {

    }
}