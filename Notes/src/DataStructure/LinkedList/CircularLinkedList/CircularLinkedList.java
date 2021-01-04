package DataStructure.LinkedList.CircularLinkedList;

import DataStructure.LinkedList.NodeClass;

public class CircularLinkedList<T> {
    private NodeClass<T> head;
    private NodeClass<T> tail;

    public void insertHead(T v) {
        NodeClass<T> newNode = new NodeClass<>(v);
        if (isEmpty()) {
            tail = newNode;
        }
        newNode.setNext(head);// Need to what is the next node
        head = newNode;
        tail.setNext(head);
        System.out.println(v.toString() + " is inserted to Head");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertTail(T v) {
        if (isEmpty()) {
            insertHead(v);
        } else {
            NodeClass<T> newNode = new NodeClass<T>(v);
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
        System.out.println(v.toString() + " is inserted to Tail");
    }

    public void deleteHead() {
        if (isEmpty()) {
            System.out.println("Sorry the list is empty");
        } else {
            T tempData = head.getData();
            if (head.getNext() == null) {
                tail = null;// reset tail
            }
            head = head.getNext();
            tail.setNext(head);
            System.out.println(tempData.toString() + " is deleted");
        }
    }

    public void displayList() {
        NodeClass<T> node = head;
        String s = "";
        while (node.getNext().getData() != head.getData()) {
            s += node.getData().toString() + " ";
            node = node.getNext();
        }
        s += node.getData().toString() + " ";
        System.out.println(s);
    }

    public void clearUp() {
        head = null;
        tail = null;
    }

}