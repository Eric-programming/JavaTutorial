package Algorithms.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };
        System.out.println(Arrays.toString(selectionSort(items)));
    }

    /**
     * 
     * Procedure SelectionSort (a)
     * 
     * Inputs: a (array)
     * 
     * Output: sorted array in ascending order
     * 
     * 1) for i = 0 to a.length -1
     * 
     * a. set min = i
     * 
     * b. for j = i + 1 to a.length
     * 
     * b1. if a[j] < a[i] then min = j
     * 
     * c. swap a[i] with a[min]
     * 
     * 2) return the sorted a.
     */
    public static long[] selectionSort(long[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    min = j;
                }
            }
            long temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
}