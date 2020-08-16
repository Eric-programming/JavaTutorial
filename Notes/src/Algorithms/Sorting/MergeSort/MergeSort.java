package Algorithms.Sorting.MergeSort;

import java.util.Arrays;

//Time Complexity: nLog(n)
//Pros = fast
//Cons = takes space (tempLeftArray and temp right array)
public class MergeSort {
    /**
     * Main Steps
     * 
     * 1) Split
     * 
     * 2) Merge
     */
    public static void main(String[] args) {
        long[] items = new long[] { 3, 4, 2, 1 };

        MergeSortMethod(items, 0, items.length - 1);// 1234

        System.out.println(Arrays.toString(items));
        // ===============================================
        long[] items2 = new long[] { 4, 3, 2, 1 };

        MergeSortMethod(items2, 0, items2.length - 1);// 1234

        System.out.println(Arrays.toString(items2));
        // ===============================================
        long[] items3 = new long[] { 6, 1, 0, 3, 2 };// 012369

        MergeSortMethod(items3, 0, items3.length - 1);

        System.out.println(Arrays.toString(items3));
    }

    public static void Merge(long[] a, int firstIndex, int midIndex, int lastIndex) {
        int leftArrSize = midIndex - firstIndex + 1;

        int rightArrSize = lastIndex - midIndex;

        long[] leftArr = new long[leftArrSize];
        long[] rightArr = new long[rightArrSize];

        // Fill the left and right arr with array a's halves data
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = a[firstIndex + i];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = a[midIndex + 1 + i];
        }

        int index = firstIndex, leftIndex = 0, rightIndex = 0;

        // modify the array a
        while (leftIndex < leftArrSize && rightIndex < rightArrSize) {
            if (leftArr[leftIndex] > rightArr[rightIndex]) {
                a[index] = rightArr[rightIndex];
                rightIndex++;
            } else {
                a[index] = leftArr[leftIndex];
                leftIndex++;
            }
            index++;
        }

        // Clean up the left or right arr

        while (leftIndex < leftArrSize) {
            a[index] = leftArr[leftIndex];
            index++;
            leftIndex++;
        }

        while (rightIndex < rightArrSize) {
            a[index] = rightArr[rightIndex];
            index++;
            rightIndex++;
        }
    }

    public static void MergeSortMethod(long[] a, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;// round down
            // Sort the first halves
            MergeSortMethod(a, firstIndex, midIndex);
            // Sort the second halves
            MergeSortMethod(a, midIndex + 1, lastIndex);

            // Merge
            Merge(a, firstIndex, midIndex, lastIndex);
        }
    }
}