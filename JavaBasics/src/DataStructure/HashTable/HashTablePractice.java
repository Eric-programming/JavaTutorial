package DataStructure.HashTable;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable is a Java Collection that stores key and value pair. The key must
 * be unique, HashTable is unordered. But if you want to have correct orders
 * when insert elements to the HashTable, then I highly recommend
 * LinkedHashTable. (Maybe i will make a video of LinkedHashSet someday)
 */
public class HashTablePractice {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(10, "London");
		map.put(30, "Washington DC");
		map.put(20, "Oslo");
		map.put(10, "Berlin");
		System.out.println(map);
		// Loop
		for (Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
