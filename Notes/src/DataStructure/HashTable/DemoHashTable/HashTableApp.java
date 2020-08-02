package DataStructure.HashTable.DemoHashTable;

import java.util.Hashtable;

/**
 * Hash table is a data structure that maps keys to values.
 * 
 * Process:
 * 
 * 1. Compute the key to hash code
 * 
 * 2. convert hashcode to a index in the array
 * 
 * 3. then insert or delete or search the linkedlist
 * 
 * Time Complexity: O(1) - O(n) on average depends on the collisions
 */
public class HashTableApp {

    public static void main(final String[] args) {
        int[] arr = new int[] { 55, 22, 44, 66, 33, 99 };
        // useHashTable(arr);
        useJavaHashTable(arr);
    }

    public static void useHashTable(int[] arr) {
        HashTableClass htc = new HashTableClass(arr.length);
        for (int i = 0; i < arr.length; i++) {
            htc.put(i, arr[i]);
        }
        System.out.println(htc.getValue(5));// it should be 99
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