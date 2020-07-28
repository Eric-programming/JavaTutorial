package DataStructure.LinkedList;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        long[] longArr = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        LinkedList<Long> javaLinkedList = new LinkedList<>();
        for (int i = 0; i < longArr.length; i++) {
            javaLinkedList.add(longArr[i]);
        }
        System.out.println(javaLinkedList);
        // Change and iterate LinkedList
        for (int i = 0; i < javaLinkedList.size(); i++) {
            javaLinkedList.set(i, javaLinkedList.get(i) + 10);
        }
        System.out.println(javaLinkedList);
        // Remove
        javaLinkedList.removeLast();
        System.out.println(javaLinkedList);
    }
}