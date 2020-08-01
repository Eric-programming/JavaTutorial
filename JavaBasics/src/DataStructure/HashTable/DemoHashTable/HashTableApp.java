package DataStructure.HashTable.DemoHashTable;

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
        int[] arr = new int[] { 55, 22, 44, 66, 33, 99 };
        useHashTable(arr);
        // useJavaHashTable(arr);

    }

    public static void useHashTable(int[] arr) {
        HashTableClass htc = new HashTableClass(arr.length);
        for (int i = 0; i < arr.length; i++) {
            htc.put(i, arr[i]);
        }
        System.out.println(htc.getValue(5).getValue());// it should be 99
        htc.removeValue(5);// 99 should be gone
        htc.put(5, 123);
    }

    public static void useJavaHashTable(int[] arr) {
        // Inserting
        Hashtable<Integer, String> table = new Hashtable<Integer, String>();
        for (int i = 0; i < arr.length; i++) {
            table.put(i, "hello" + arr[i]);// add
        }
        System.out.println("Inserted values to the table =>" + table);

        // Remove value
        table.remove(0);
        System.out.println(table);

        // Replace value
        table.put(1, "replace" + arr[1]);
        System.out.println("Replace key of 1 => " + table);

        // Compute if absent
        table.computeIfAbsent(0, j -> "number" + arr[0]);
        System.out.println("Successful insert a value to key at 0 if key is not associated with a value" + table);
        table.computeIfAbsent(0, j -> "NUMBER" + arr[0]);
        System.out.println("Fail to insert a value to key at 0 if key is not associated with a value" + table);

        // Check if a value exists
        System.out.println("Is value 'number' exists in the hashtable=> " + table.contains("number"));
    }
}