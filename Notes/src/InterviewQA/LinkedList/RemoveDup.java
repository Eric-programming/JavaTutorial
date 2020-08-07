/**
 * Write a removeDuplicates() function which takes a linkedlist and deletes any
 * duplicate nodes from the list. The list is not sorted.
 */

package InterviewQA.LinkedList;

import java.util.ArrayList;
import java.util.HashSet;

import DataStructure.LinkedList.NodeClass;

public class RemoveDup {

    public static void main(String[] args) {
        NodeClass<Integer> LinkedListNode = new NodeClass<>(1);
        LinkedListNode.setNext(new NodeClass<>(1));
        LinkedListNode.getNext().setNext(new NodeClass<>(2));
        LinkedListNode.getNext().getNext().setNext(new NodeClass<>(2));
        LinkedListNode.getNext().getNext().getNext().setNext(new NodeClass<>(3));
        LinkedListNode.getNext().getNext().getNext().getNext().setNext(new NodeClass<>(3));

        // System.out.println(removeDuplicates(LinkedListNode));// 1,2,3

        System.out.println(removeDuplicates_2(LinkedListNode));// 1,2,3

    }

    /**
     * Brute force
     * 
     * Time complexity: n^2
     */
    public static String removeDuplicates(NodeClass<Integer> node) {
        NodeClass<Integer> startNode = node;
        // Remove all duplicates
        while (startNode != null) {
            NodeClass<Integer> tempNode = startNode;
            while (tempNode.getNext() != null) {
                if (tempNode.getNext().getData() == startNode.getData()) {
                    tempNode.setNext(tempNode.getNext().getNext());
                } else {
                    tempNode = tempNode.getNext();
                }
            }
            startNode = startNode.getNext();
        }
        return printList(node);
    }

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

    /**
     * Hashset
     * 
     * Time Complexity: n
     */
    public static String removeDuplicates_2(NodeClass<Integer> node) {
        HashSet<Integer> set = new HashSet<>();

        NodeClass<Integer> startNode;

        if (node == null) {
            return null;
        } else {
            startNode = node;
            set.add(startNode.getData());
        }
        while (startNode.getNext() != null) {
            if (set.contains(startNode.getNext().getData())) {
                startNode.setNext(startNode.getNext().getNext());
            } else {
                set.add(startNode.getNext().getData());
                startNode = startNode.getNext();
            }
        }
        return printList(node);
    }
}