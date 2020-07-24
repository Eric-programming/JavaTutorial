package DataStructure.LinkedList;

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
        // 1=>2=>3=>4=>5=>6
        // k = 2
        while (head.getNext() != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
        System.out.println(head.getData());
    }
    /**
     * Pseudocode: Remove the nth node from the end
     * 
     * Complexity: n(n+n) = n^2 + n^2 = 2n^2 = n^2
     * 
     * Procedure remove_nth_node_from_the_end(l)
     * 
     * Inputs: l (LinkedList)
     * 
     * Outputs: new linkedlist
     * 
     * 1) set sp =
     * 
     * 2) For each index i going from 0 to a.length. If a[i] = 0,
     * 
     * then set count = 1
     * 
     * for each index l = i -1 to 0, if a[l] = 1 then count increment by 1
     * 
     * for each index r = i + 1 to a.length - 1, if a[r] = 1 then count increment by
     * 1
     * 
     * if max < count then max = count
     * 
     * 3) return max
     */
}