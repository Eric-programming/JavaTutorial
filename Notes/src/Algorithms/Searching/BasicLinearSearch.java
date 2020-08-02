package Algorithms.Searching;

/**
 * Pseudocode (English sentence to communicate the procedure)
 * 
 * Procedure LinearSearch(a,x)
 * 
 * Inputs: a (array to search), x (the value to search for)
 * 
 * Outputs: Index position or -1 (means not found)
 * 
 * 1) Sets result to -1
 * 
 * 2) For each index i going from 1 to n. If a[i] = x, then results = i
 * 
 * 3) return the value of result
 */
public class BasicLinearSearch {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(LinearSearch(items, items[2]));
    }

    public static Long LinearSearch(long[] a, long x) {
        long result = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                result = i;
            }
        }
        return result;
    }
}