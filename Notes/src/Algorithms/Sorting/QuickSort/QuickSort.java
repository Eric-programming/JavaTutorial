package Algorithms.Sorting.QuickSort;

import java.util.Arrays;

// nLog(n) average or worst case O(n^2)
public class QuickSort {
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };
        QuickSortMethod(items, 0, items.length - 1);// 1,2,3,4
        System.out.println(Arrays.toString(items));

        long[] items2 = new long[] { 4, 3, 2, 1 };
        QuickSortMethod(items2, 0, items2.length - 1);// 1,2,3,4
        System.out.println(Arrays.toString(items2));

        long[] items3 = new long[] { 6, 1, 9, 0, 3, 2 };// 0,1,2,3,6,9
        QuickSortMethod(items3, 0, items3.length - 1);
        System.out.println(Arrays.toString(items3));
    }

    public static void QuickSortMethod(long[] a, int f, int l) {
        if (f < l) {
            int p = ParitionMethod(a, f, l);
            QuickSortMethod(a, f, p - 1);
            QuickSortMethod(a, p + 1, l);
        }
    }

    public static void SwitchPositions(long[] a, int firstIndex, int secondIndex) {
        long temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }

    public static int ParitionMethod(long[] a, int firstIndex, int lastIndex) {
        long x = a[lastIndex]; // Last index = pivot point
        int i = firstIndex - 1, j = firstIndex;
        while (j < lastIndex) {
            if (a[j] < x) {
                i++;
                SwitchPositions(a, i, j);
            }
            j += 1;
        }
        SwitchPositions(a, i + 1, lastIndex);// Switch position with the pivot point
        return i + 1;
    }
}