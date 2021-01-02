package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Linkedlist is a Java Collection that is very similar to arrayList.
 * 
 * LinkedList contains a list of nodes that each nodes has a link to the next
 * node.
 */
public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(12);
		nums.add(34);
		System.out.println(nums);
		nums.add(1);
		// Sort
		Collections.sort(nums);
		// Remove last node
		nums.removeLast();
		// Remove first node
		nums.remove(0);
		// Clear the linkedlist
		nums.clear();

	}

}
