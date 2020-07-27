package DataStructure.HashTable;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashTableP1 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 3, 3, 4, 5, 11, 11 };
        ArrayList<Integer> list = find_unique_number(array);
        System.out.println(list);
    }

    /**
     * Find unique number in Array using HashTable O(n)
     */
    public static ArrayList<Integer> find_unique_number(int[] arr) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            ht.put(arr[i], arr[i]);// remove dup
        }
        // convert ht to arraylist
        ArrayList<Integer> al = new ArrayList<>();
        for (Integer key : ht.keySet()) {
            al.add(key);
        }
        return al;
    }

}