package DataStructure.LinkedList.LinkedListProblems;

import DataStructure.LinkedList.NodeClass;

public class LinkedListP1 {
    public static void main(String[] args) {
        int[] items = new int[] { 1, 2, 3, 4, 5, 6 };
        NodeClass<Integer> n = new NodeClass<>(null);
        NodeClass<Integer> head = n;
        for (int i = 0; i < items.length; i++) {
            NodeClass<Integer> nextNode = new NodeClass<>(items[i]);
            n.setNext(nextNode);
            n = nextNode;
        }
        printOut(head);

        // 1>=2=>3=>4=>5=>6
        // k = 2
        // 1=>2=>3=>4=>6
        printOut(remove_nth_node_from_the_end(head, 2));

        // printOut(badSolution(head, 2));

    }

    public static void printOut(NodeClass<Integer> node) {
        String str = "";
        while (node.getNext() != null) {
            str += node.getData() + " ";
            node = node.getNext();
        }
        System.out.println(str + node.getData());
    }

    /**
     * Bad solution because you are doing two pass instead of one pass
     */
    public static NodeClass<Integer> badSolution(NodeClass<Integer> head, int k) {
        // find the length = 1 pass
        int length = 0;
        NodeClass<Integer> dummy_head = head;
        while (dummy_head.getNext() != null) {
            dummy_head = dummy_head.getNext();
            length++;
        }
        // find the destination = 1 pass
        int destinationIndex = length - k;
        int index = 0;
        dummy_head = head;
        while (index < destinationIndex) {
            dummy_head = dummy_head.getNext();
            index++;
        }
        dummy_head.setNext(dummy_head.getNext().getNext());
        return head;
    }

    /**
     * Pseudocode: Remove the nth node from the end
     * 
     * Procedure remove_nth_node_from_the_end(l)
     * 
     * Inputs: head (NodeClass), k (delete how many nodes from the end)
     * 
     * Outputs: dummy_head (NodeClass)
     * 
     * 1) set slow = head, fast = head, dummy_head = head index = 0
     * 
     * 2) while index < k then fast = fast.getNext() and increment index by 1
     * 
     * 3) while fast.getNext() != null then fast = fast.getNext() and slow =
     * slow.getData()
     * 
     * 4)slow.setNext(slow.getNext().getNext())
     * 
     * 5) return dummy_head
     */
    public static NodeClass<Integer> remove_nth_node_from_the_end(NodeClass<Integer> head, int k) {
        NodeClass<Integer> slow = head, fast = head, dummy_head = head;
        int index = 0;
        // Make that there is a distance of k between fast and slow
        while (index < k) {
            fast = fast.getNext();
            index++;
        }

        while (fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        slow.setNext(slow.getNext().getNext());
        return dummy_head;
    }

}