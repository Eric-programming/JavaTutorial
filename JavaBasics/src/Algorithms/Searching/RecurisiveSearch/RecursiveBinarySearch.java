package Algorithms.Searching.RecurisiveSearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };

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
     * 1) mid =0, while f < l then do the followings
     * 
     * a. set mid = round down [(first + last) / 2]
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
    // public static Long RecuriveBinarySearchMethod() {

    // }
}