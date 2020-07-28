package JavaCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Hashmap is a Java Collection that stores key and value pair. The key must be
 * unique, hashmap is unordered. But if you want to have correct orders when
 * insert elements to the hashmap, then I highly recommend LinkedHashMap. (Maybe
 * i will make a video of LinkedHashSet someday)
 */
public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
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
