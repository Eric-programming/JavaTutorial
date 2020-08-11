package Algorithms.Searching.RecurisiveSearch;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(RecursiveLinearSearchMethod(items, 0, 8));
        System.out.println(RecursiveLinearSearchMethod(items, 0, 100));

    }

    /**
     * 
     * Procedure RecursiveLinearSearch (a, i, x)
     * 
     * Inputs: A (array), i (starting index), x (value)
     * 
     * Output: Find the index position for element x
     * 
     * 1) If i > a.length - 1 then return -1
     * 
     * 
     * 2) else if a[i] == x then return i
     * 
     * 3) else return RecursiveSearch(a i+1, x)
     */
    public static int RecursiveLinearSearchMethod(long[] a, int i, long x) {
        if (i > a.length - 1) {
            return -1;// not found
        } else if (a[i] == x) {
            return i;
        } else {
            System.out.println("pass index of " + i);
            return RecursiveLinearSearchMethod(a, i + 1, x);
        }
    }
}