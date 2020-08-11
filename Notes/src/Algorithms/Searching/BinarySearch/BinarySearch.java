package Algorithms.Searching.BinarySearch;

/**
 * Pseudocode (English sentence to communicate the procedure)
 * 
 * Procedure BinarySearchMethod(a, x)
 * 
 * Input: a (array to search from), x (item to search for)
 * 
 * output: index position or -1 if not found
 * 
 * 1) first = 0, last = length of a - 1, mid = 0
 * 
 * 2) while first < last do the followings
 * 
 * a. set mid = round [(first + last) / 2]
 * 
 * b. if a[mid] = x then return mid
 * 
 * c. if a[mid] > x then last = mid. else if a[mid] < x then first = mid
 * 
 * 3) return -1
 * 
 * 
 * Time complexity: Log(n)
 */
public class BinarySearch {
    public static void main(String[] args) {
        // Data Must be sorted
        long[] items = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(BinarySearchMethod(items, items[3]));
        // System.out.println(BinarySearchMethod(items, Long.valueOf(8)));

    }

    public static int BinarySearchMethod(long[] a, long x) {
        int first = 0;
        int last = a.length - 1;
        int mid;
        while (first < last) {
            mid = (last + (first - last) / 2);// Round up
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                first = mid;
            } else {
                last = mid;
            }
        }
        return -1;
    }

}