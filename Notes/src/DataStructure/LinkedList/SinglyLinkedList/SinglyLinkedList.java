package LinkedList.SinglyLinkedList;

import LinkedList.NodeClass;

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
        if (isEmpty()) {
            System.out.println("Sorry there are no more nodes");
        } else {
            NodeClass<T> tempNode = firstNode;
            firstNode = firstNode.getNext();
            System.out.println(tempNode.getData().toString() + " is removed");
        }
    }

    public void displayList() {
        NodeClass<T> node = firstNode;
        String s = "";
        while (node.getNext() != null) {
            s += node.getData().toString() + " ";
            node = node.getNext();
        }
        s += node.getData().toString() + " ";
        System.out.println(s);
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Sorry there are no more nodes");
        } else {
            NodeClass<T> tempNode = firstNode;
            while (tempNode.getNext().getNext() != null) {
                tempNode = tempNode.getNext();
            }
            System.out.println("Delete Last value " + tempNode.getNext().getData().toString());
            tempNode.setNext(null);
        }
    }

    public void insertLast(T v) {
        NodeClass<T> node = new NodeClass<>(v);
        if (isEmpty()) {
            firstNode = node;
        } else {
            NodeClass<T> tempNode = firstNode;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node);
            System.out.println("Insert Last value " + v.toString());
        }
    }
}