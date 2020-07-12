package Algorithms.Sorting.QuickSort;

import java.util.Arrays;

// nLog(n) average or worst case O(n^2)
public class QuickSort {
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };
        QuickSortMethod(items, 0, items.length - 1);
        System.out.println(Arrays.toString(items));

        long[] items2 = new long[] { 4, 3, 2, 1 };
        QuickSortMethod(items2, 0, items2.length - 1);
        System.out.println(Arrays.toString(items2));

        long[] items3 = new long[] { 6, 1, 9, 0, 3, 2 };
        QuickSortMethod(items3, 0, items3.length - 1);
        System.out.println(Arrays.toString(items3));
    }

    /**
     * Procedure InsertionSortMethod (a, f, l)
     * 
     * Inputs: a (array), f (first Index), l (last index)
     * 
     * Output: Nothing
     * 
     * if f < l
     * 
     * then do the followings
     * 
     * 1) p = Partition(a, f, l)
     * 
     * 2) QuickSortMethod(a, f, p -1)
     * 
     * 3) QuickSortMethod(a, q + 1, l)
     * 
     */
    public static void QuickSortMethod(long[] a, int f, int l) {
        if (f < l) {
            int p = ParitionMethod(a, f, l);
            QuickSortMethod(a, f, p - 1);
            QuickSortMethod(a, p + 1, l);
        }
    }

    /**
     * Procedure Partition(a, f, l)
     * 
     * Inputs: a (array), f (first Index), l (last index)
     * 
     * Output: Nothing
     * 
     * 1) set x = a[l], i = f-1, j = f
     * 
     * 2) while j < l then do the followings:
     * 
     * 2a) if a[j ] < x then i increment by 1 swap a[i] with a[j]
     * 
     * 2b) j increment by 1
     * 
     * 3) swap a[i + 1] with a[l] return i + 1
     */
    public static int ParitionMethod(long[] a, int f, int l) {
        long x = a[l];
        int i = f - 1, j = f;
        while (j < l) {
            if (a[j] < x) {
                i += 1;
                long temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j += 1;
        }
        long temp = a[i + 1];
        a[i + 1] = a[l];// which is x
        a[l] = temp;
        return i + 1;
    }
}