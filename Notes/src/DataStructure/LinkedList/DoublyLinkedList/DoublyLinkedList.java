package LinkedList.DoublyLinkedList;

import LinkedList.DoublyNode;

//Most Common because features of Next & Previous
public class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertHead(T v) {
        DoublyNode<T> newNode = new DoublyNode<T>(v);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.setPreviousDoublyNode(newNode);
        }
        newNode.setNextDoublyNode(head);
        head = newNode;
        System.out.println(v.toString() + " is inserted to the head");
    }

    public void insertTail(T v) {
        if (isEmpty()) {
            insertHead(v);
        } else {
            DoublyNode<T> newNode = new DoublyNode<>(v);
            newNode.setPreviousDoublyNode(tail);
            tail.setNextDoublyNode(newNode);
            tail = newNode;
        }
    }

    public void deleteHead() {
        if (isEmpty()) {
            System.out.println("Sorry the list is empty");
        } else {
            DoublyNode<T> tempHead = head;
            // If there is only 1 node in the list
            if (head.getNextDoublyNode() == null) {
                tail.setData(null);// (reset the list)
            } else {
                head.getNextDoublyNode().setPreviousDoublyNode(null);
            }
            head = head.getNextDoublyNode();
            System.out.println(tempHead.getData().toString() + " is deleted");
        }
    }

    public void deleteTail() {
        if (isEmpty()) {
            System.out.println("Sorry the list is empty");
        } else {
            DoublyNode<T> tempTail = tail;
            // If there is only 1 node in the list
            if (head.getNextDoublyNode() == null) {
                tail.setData(null);// (reset the list)
            } else {
                tail.getPreviousDoublyNode().setNextDoublyNode(null);
            }
            tail = tail.getPreviousDoublyNode();
            System.out.println(tempTail.getData().toString() + " is deleted");
        }
    }

    public void insertAfter(T key, T v) {
        DoublyNode<T> tempNode = head;
        while (tempNode.getNextDoublyNode() != null) {
            if (tempNode.getData() == key) {
                break;
            }
            tempNode = tempNode.getNextDoublyNode();
        }
        if (tempNode.getData() != key) {
            System.out.println("Sorry we are unable to find the key value");
        } else {
            // Once we found the node to insert after
            DoublyNode<T> newNode = new DoublyNode<>(v);
            DoublyNode<T> rightNode = tempNode.getNextDoublyNode();
            // Left
            tempNode.setNextDoublyNode(newNode);
            newNode.setPreviousDoublyNode(tempNode);
            // Right
            if (rightNode != null) {
                newNode.setNextDoublyNode(rightNode);
                rightNode.setPreviousDoublyNode(newNode);
            } else {
                // redefine tail
                tail.setNextDoublyNode(newNode);
                tail = newNode;
            }
        }
        System.out.println("We successfully insert " + v.toString() + " after " + key.toString());
    }

    public void deleteNodeWithKey(T key) {
        // Find the Node
        DoublyNode<T> tempNode = head;
        while (tempNode.getNextDoublyNode() != null) {
            if (tempNode.getData() == key) {
                break;
            }
            tempNode = tempNode.getNextDoublyNode();
        }
        // Delete the Node
        if (tempNode.getData() != key) {
            System.out.println("Sorry we are unable to find the key value");
        } else {
            // Once we found the node then we delete the node
            if (tempNode.getPreviousDoublyNode() == null && tempNode.getNextDoublyNode() == null) {
                // 1 Node
                head = null;
                tail = null;
            } else if (tempNode.getPreviousDoublyNode() == null) {
                // Head
                tempNode.getNextDoublyNode().setPreviousDoublyNode(null);
                head = tempNode.getNextDoublyNode();
            } else if (tempNode.getNextDoublyNode() == null) {
                // Tail
                tempNode.getPreviousDoublyNode().setNextDoublyNode(null);
                tail = tempNode.getPreviousDoublyNode();
            } else {
                System.out.println(tempNode.getData());
                // Body
                DoublyNode<T> rightNode = tempNode.getNextDoublyNode();
                DoublyNode<T> leftNode = tempNode.getPreviousDoublyNode();
                // Left
                leftNode.setNextDoublyNode(rightNode);
                // Right
                rightNode.setPreviousDoublyNode(leftNode);
            }
        }
        System.out.println("We successfully delete " + key.toString());
    }

    public void displayList() {
        DoublyNode<T> node = head;
        String s = "";
        while (node.getNextDoublyNode() != null) {
            s += node.getData().toString() + " ";
            node = node.getNextDoublyNode();
        }
        s += node.getData().toString() + " ";
        System.out.println(s);
    }
}