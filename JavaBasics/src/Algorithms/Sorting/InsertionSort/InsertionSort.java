package Algorithms.Sorting.InsertionSort;

import java.util.Arrays;

//O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };
        // 3421
        // 3241
        // 2341
        // 2314
        // 2134
        // 1234
        System.out.println(Arrays.toString(InsertionSortMethod(items)));
        // System.out.println(Arrays.toString(name(items)));

        long[] items2 = new long[] { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(InsertionSortMethod(items2)));
        // System.out.println(Arrays.toString(name(items2)));

        long[] items3 = new long[] { 6, 1, 9, 0, 3, 2 };
        System.out.println(Arrays.toString(InsertionSortMethod(items3)));
        // System.out.println(Arrays.toString(name(items3)));
    }

    /**
     * 
     * Procedure InsertionSortMethod (a)
     * 
     * Inputs: a (array)
     * 
     * Output: sorted array in ascending order
     * 
     * 1) for i = 1 to a.length -1
     * 
     * a. set currentIndex = i, set j = i-1
     * 
     * b. while a[j] < a[currentIndex] and j >= 0
     * 
     * b1. swap a[currentIndex] with a[j]
     * 
     * b2. j decrement by 1
     * 
     * b3. currentIndex decrement by 1
     * 
     * 2) return the sorted a.
     */
    public static long[] InsertionSortMethod(long[] a) {
        for (int i = 1; i < a.length; i++) {
            int currentIndex = i;
            int j = i - 1;
            while (j >= 0 && a[j] > a[currentIndex]) {// Make sure to follow this order in the params because -1 is
                                                      // going to be out of bounce
                long temp = a[j];
                a[j] = a[currentIndex];
                a[currentIndex] = temp;
                j -= 1;
                currentIndex -= 1;
            }
        }
        return a;
    }
}