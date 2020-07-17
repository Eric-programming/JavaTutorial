package DataStructure.HashTable;

import java.util.Hashtable;

/**
 * HashTableApp
 * 
 * Pro: O(1) for retrive data & inseration & deletion
 * 
 * Con:
 * 
 * Concepts: Key => Value
 * 
 * key(Any object) => Hashcode => index => retrive the data in the array at a
 * given index
 */
public class HashTableApp {

    public static void main(final String[] args) {
        int[] arr = new int[] { 0, 1, 2, 3, 4, 5 };

        // Inserting
        Hashtable<Integer, String> table = new Hashtable<Integer, String>();
        for (int i = 0; i < arr.length; i++) {
            table.put(i, "hello" + arr[i]);
        }
        System.out.println("Inserted values to the table =>" + table);

        // Remove value
        table.remove(arr[0]);
        System.out.println("Key arr[0] removed from the table =>" + table);

        // Replace value
        table.put(arr[1], "replace" + arr[1]);
        System.out.println("Replace value of arr[1] => " + table);

        // Compute if absent
        table.computeIfAbsent(arr[0], j -> "number" + arr[0]);
        System.out.println("insert a value to key at arr[0] if key is not associated with a value" + table);
        table.computeIfAbsent(arr[0], j -> "NUMBER" + arr[0]);
        System.out.println("insert a value to key at arr[0] if key is not associated with a value" + table);

        // Check if a value exists
        System.out.println("Is value 'number' exists in the hashtable=> " + table.contains("number"));
    }
}