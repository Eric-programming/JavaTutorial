package Algorithms.Sorting.MergeSort;

import java.util.Arrays;

//nLog(n)
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

        MergeSortMethod(items, 0, items.length - 1);

        System.out.println(Arrays.toString(items));
        // ===============================================
        long[] items2 = new long[] { 4, 3, 2, 1 };

        MergeSortMethod(items2, 0, items2.length - 1);

        System.out.println(Arrays.toString(items2));
        // ===============================================
        long[] items3 = new long[] { 6, 1, 9, 0, 3, 2 };

        MergeSortMethod(items3, 0, items3.length - 1);

        System.out.println(Arrays.toString(items3));
    }

    /**
     * 
     * Procedure Merge (a, f, m, l)
     * 
     * Inputs: a (array), f (first index), m(mid index), l (last index)
     * 
     * Output: Merge the array
     * 
     * 1) set leftSize = m - f + 1, set rightSize = l - m
     * 
     * 2) set leftArray with the size of leftSize, set rightArray with the size of
     * rightSize
     * 
     * 3)Copy the data from a[f] to a[mid] to the leftArray
     * 
     * 4)Copy the data from a[mid] to a[l] to the rightArray
     * 
     * 5) set leftIndex = 0, set rightIndex = 0, set index = f
     * 
     * 6) while leftIndex < leftSize and rightIndex < rightSize then do the
     * followings
     * 
     * 6a) if leftArray[leftIndex] < rightArray[rightIndex]
     * 
     * then a[index] = leftArray[leftIndex], leftIndex increment by 1
     * 
     * 6b) else then a[index] = rightArray[rightIndex], rightIndex increment by 1
     * 
     * 6c) index increment by 1
     * 
     * 7) Copy remaining value from leftArray to a if any
     * 
     * 8) Copy remaining value from rightArray to a if any
     */
    public static void Merge(long[] a, int f, int m, int l) {
        // Create two subarrays
        int leftSize = m - f + 1;
        int rightSize = l - m;

        long[] leftArray = new long[leftSize];
        long[] rightArray = new long[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = a[i + f];
        }
        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = a[i + m + 1];
        }

        // Sort and merge the arrays
        int leftIndex = 0, rightIndex = 0, index = f;
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                a[index] = leftArray[leftIndex];
                leftIndex += 1;
            } else {
                a[index] = rightArray[rightIndex];
                rightIndex += 1;
            }
            index += 1;
        }

        // Clean up the remaining elements
        while (leftIndex < leftSize) {
            a[index] = leftArray[leftIndex];
            leftIndex += 1;
            index += 1;
        }

        while (rightIndex < rightSize) {
            a[index] = rightArray[rightIndex];
            rightIndex += 1;
            index += 1;
        }

    }

    /**
     * 
     * Procedure MergeSortMethod (a, firstIndex, lastIndex)
     * 
     * Inputs: a (array)
     * 
     * Output: Split the array
     * 
     * if(firstIndex < lastIndex) then
     *
     * a) set midIndex = (firstIndex+lastIndex)/2
     * 
     * b) MergeSortMethod(a, firstIndex, midIndex)
     * 
     * c) MergeSortMethod(a, midIndex + 1, lastIndex)
     * 
     * d) return merge (arr)
     */
    public static void MergeSortMethod(long[] a, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int midIndex = ((firstIndex + lastIndex) / 2);// Round down
            // Left
            MergeSortMethod(a, firstIndex, midIndex);
            // Right
            MergeSortMethod(a, midIndex + 1, lastIndex);
            Merge(a, firstIndex, midIndex, lastIndex);
        }
    }
}