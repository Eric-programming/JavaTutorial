package Algorithms.Sorting.MergeSort;

import java.util.Arrays;

//nLog(n)
public class MergeSort {
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };
        // 3421
        // 3241
        // 2341
        // 2314
        // 2134
        // 1234
        System.out.println(Arrays.toString(MergeSortMethod(items)));
        // System.out.println(Arrays.toString(name(items)));

        long[] items2 = new long[] { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(MergeSortMethod(items2)));
        // System.out.println(Arrays.toString(name(items2)));

        long[] items3 = new long[] { 6, 1, 9, 0, 3, 2 };
        System.out.println(Arrays.toString(MergeSortMethod(items3)));
        // System.out.println(Arrays.toString(name(items3)));
    }

    /**
     * 
     * Procedure MergeSortMethod (a, f, l)
     * 
     * Inputs: a (array), f (first index), l (last index)
     * 
     * Output: sorted array in ascending order
     * 
     * 1) Split
     * 
     * 2) Merge
     */
    public static long[] MergeSortMethod(long[] a) {

    }
    /**
     * 
     * Procedure MergeMethod (a, f, l)
     * 
     * Inputs: a (array), f (first index), m(mid index), l (last index)
     * 
     * Output: Merge the array
     */
}