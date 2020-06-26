package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "London");
		map.put(3, "Washington DC");
		map.put(2, "Oslo");
		map.put(1, "Berlin");
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
