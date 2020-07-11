package Algorithms.Searching.RecurisiveSearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(RecuriveBinarySearchMethod(items, 0, items.length - 1, 8));
    }

    /**
     * 
     * Procedure RecursiveBinarySearch (a, f, l, x)
     * 
     * Inputs: a (array), f (starting index), l (last index), x (value)
     * 
     * Output: Find the index position for element x
     * 
     * 
     * 1)
     * 
     * a. set mid = round [(f + l) / 2]
     * 
     * b. if a[mid] = x then return mid
     * 
     * c. else if a[mid] > x then return RecursiveBinarySearch(a, f, mid, x)
     * 
     * d. else if a[mid] < x then return RecursiveBinarySearch(a, mid, l, x)
     * 
     * 
     * 2) return -1 if not found
     * 
     */
    public static int RecuriveBinarySearchMethod(long[] a, int f, int l, long x) {
        if (f <= l) {
            int mid = (l + (f - l) / 2);// round
            System.out.println("Mid point is =>" + mid);
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                return RecuriveBinarySearchMethod(a, f, mid, x);
            } else {
                return RecuriveBinarySearchMethod(a, mid, l, x);
            }
        }
        return -1;

    }
}