package Algorithms.Sorting.SelectionSort;

import java.util.Arrays;

// Time Complexity: O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };// 1234
        System.out.println(Arrays.toString(selectionSortMethod(items)));

        long[] items2 = new long[] { 4, 3, 2, 1 };// 1234
        System.out.println(Arrays.toString(selectionSortMethod(items2)));

        long[] items3 = new long[] { 6, 1, 9, 0, 3, 2 };// 012369
        System.out.println(Arrays.toString(selectionSortMethod(items3)));

    }

    public static long[] selectionSortMethod(long[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            // once we found the min index, we swap the value position
            long tempValue = a[minIndex];
            a[minIndex] = a[i];
            a[i] = tempValue;
        }
        return a;
    }
}