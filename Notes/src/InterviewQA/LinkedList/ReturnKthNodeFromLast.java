package InterviewQA.LinkedList;

import java.util.ArrayList;

import DataStructure.LinkedList.NodeClass;

/**
 * Given a Linked List and a number k, write a function that remove the value at
 * the kth node from the end of the Linked List.
 * 
 * Given linked list: 1->2->3->4->5, and k = 2.
 * 
 * 1->2->3->5
 */
public class ReturnKthNodeFromLast {
    public static String printList(NodeClass<Integer> node) {
        // Print all the nodes
        NodeClass<Integer> startNode = node;
        ArrayList<Integer> arr = new ArrayList<>();
        while (startNode.getNext() != null) {
            arr.add(startNode.getData());
            startNode = startNode.getNext();
        }
        arr.add(startNode.getData());
        return arr.toString();
    }

    public static void main(String[] args) {
        NodeClass<Integer> LinkedListNode = new NodeClass<>(1);
        LinkedListNode.setNext(new NodeClass<>(2));
        LinkedListNode.getNext().setNext(new NodeClass<>(3));
        LinkedListNode.getNext().getNext().setNext(new NodeClass<>(4));
        LinkedListNode.getNext().getNext().getNext().setNext(new NodeClass<>(5));

        System.out.println(ReturnKthNodeFromLastSolution_2(LinkedListNode, 4));
    }

    /**
     * Find the length and use the length to find the last kth node
     * 
     * last kth node = length - k
     * 
     * Time Complexity: n
     */

    public static String ReturnKthNodeFromLastSolution(NodeClass<Integer> node, int kth) {
        if (node == null)
            return null;

        // find the length

        int length = 0;
        NodeClass<Integer> startNode = node;
        while (startNode.getNext() != null) {
            length++;
            startNode = startNode.getNext();
        }
        length++;

        // remove the kth node

        int kthNodeIndex = length - kth;
        startNode = node;
        for (int i = 0; i < kthNodeIndex - 1; i++) {
            startNode = startNode.getNext();
        }
        startNode.setNext(startNode.getNext().getNext());
        return printList(node);
    }

    /**
     * Two pointer
     * 
     * Time Complexity: n
     */
    public static String ReturnKthNodeFromLastSolution_2(NodeClass<Integer> node, int kth) {
        if (node == null)
            return null;

        NodeClass<Integer> p1 = node, p2 = node;
        // Create distance between p1 - p2 = kth
        for (int i = 0; i < kth; i++) {
            if (p2 == null)
                return null;
            p2 = p2.getNext();
        }

        while (p2.getNext() != null) {
            p2 = p2.getNext();
            p1 = p1.getNext();
        }
        p1.setNext(p1.getNext().getNext());
        return printList(node);
    }
}