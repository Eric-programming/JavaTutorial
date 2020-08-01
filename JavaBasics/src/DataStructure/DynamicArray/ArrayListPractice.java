package DataStructure.DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * ArrayList is a Java Collection that doesn't have a fixed size because when
 * the size is exceeded then it could expand, and when the elements removed from
 * the list, it could shrink.
 */
public class ArrayListPractice {

	public static void main(String[] args) {
		// How to implement ArrayList
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(12);
		nums.add(96);
		nums.add(34);
		nums.add(34);
		nums.remove(3);// Remove 34
		System.out.println(nums);

		// Sort ArrayList
		Collections.sort(nums);
		System.out.println(nums);

		// ArrayList with Objects
		ArrayList<ArrayListHuman> ArrayListHumans = new ArrayList<>();
		ArrayListHumans.add(new ArrayListHuman("tom", 12));
		ArrayListHumans.add(new ArrayListHuman("tom", 89));
		ArrayListHumans.add(new ArrayListHuman("tom", 34));
		ArrayListHumans.add(new ArrayListHuman("tom", 1));
		System.out.println(ArrayListHumans);

		// Sorted ArrayList with Objects
		Collections.sort(ArrayListHumans);// Sort
		System.out.println(ArrayListHumans);

		// Convert Hashset to Array List
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(0);
		hashset.add(1);
		ArrayList<Integer> list = new ArrayList<Integer>(hashset);
		System.out.println(list);
	}
}

class ArrayListHuman implements Comparable<ArrayListHuman> {
	String name;
	int age;

	public ArrayListHuman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	public int compareTo(ArrayListHuman h) {
		if (age > h.age) {
			return 1;
		} else if (age < h.age) {
			return -1;
		}
		return 0;
	}
}
