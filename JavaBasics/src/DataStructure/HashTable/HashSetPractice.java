package DataStructure.HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * Hashset is a Java Collection that uses a hash table for storing data.
 * Basically it uses the key to convert to a hashcode and then use the hashcode
 * to store the data.
 */
public class HashSetPractice {
	public static void main(String[] args) {
		// Set removes the duplicates
		Set<Integer> simpleHashSet = new HashSet<>();
		simpleHashSet.add(1);
		simpleHashSet.add(1);
		simpleHashSet.add(1);
		simpleHashSet.add(1);
		System.out.println(simpleHashSet);// 1

		// Hashset with objects
		Set<HashSetHuman> persons = new HashSet<>();
		persons.add(new HashSetHuman("Eric", 100));
		persons.add(new HashSetHuman("A", 1000));
		persons.add(new HashSetHuman("Eric", 100));// This will become a duplicate

		for (HashSetHuman HashSetHuman : persons) {
			System.out.println(HashSetHuman);
		}

		// why?
		HashSetHuman eric1 = new HashSetHuman("Eric", 100);
		HashSetHuman eric2 = new HashSetHuman("Eric", 100);
		System.out.println(eric1.hashCode());
		System.out.println(eric2.hashCode());

		// Solution to remove duplicate objects in hashset
		HashSet<HashSetHuman2> persons2 = new HashSet<>();

		HashSetHuman2 dup = new HashSetHuman2("Eric", 100);
		HashSetHuman2 dup2 = new HashSetHuman2("Eric", 100);

		// check this out~
		System.out.println(dup.hashCode());
		System.out.println(dup2.hashCode());

		persons2.add(dup);
		persons2.add(new HashSetHuman2("A", 1000));
		persons2.add(dup2);

		for (HashSetHuman2 HashSetHuman2 : persons2) {
			System.out.println(HashSetHuman2);
		}
	}

}

class HashSetHuman {
	String name;
	int age;

	public HashSetHuman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "HashSetHuman [name=" + name + ", age=" + age + "]";
	}
}

class HashSetHuman2 {
	String name;
	int age;

	public HashSetHuman2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "HashSetHuman2 [name=" + name + ", age=" + age + "]";
	}

	// Generate Hashcode for the hashset
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetHuman2 other = (HashSetHuman2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
