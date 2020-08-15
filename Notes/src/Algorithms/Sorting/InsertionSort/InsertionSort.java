package Algorithms.Sorting.InsertionSort;

import java.util.Arrays;

//Time Complexity: O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };// 1234
        // 3421
        // 3241
        // 2341
        // 2314
        // 2134
        // 1234
        System.out.println(Arrays.toString(InsertionSortMethod(items)));

        long[] items2 = new long[] { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(InsertionSortMethod(items2)));// 1234

        long[] items3 = new long[] { 6, 1, 9, 0, 3, 2 };
        System.out.println(Arrays.toString(InsertionSortMethod(items3)));// 012369
    }

    public static long[] InsertionSortMethod(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentIndex = i;
            int leftCurrentIndex = i - 1;
            while (leftCurrentIndex >= 0 && arr[leftCurrentIndex] > arr[currentIndex]) {
                // swap the positions
                Long tempValue = arr[leftCurrentIndex];
                arr[leftCurrentIndex] = arr[currentIndex];
                arr[currentIndex] = tempValue;
                // move both index to the left
                leftCurrentIndex--;
                currentIndex--;
            }
        }
        return arr;
    }
}