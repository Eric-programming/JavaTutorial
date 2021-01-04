package Algorithms.Sorting;

import java.util.Arrays;

import Algorithms.Sorting.AbstractClass.Sort;
import Algorithms.Sorting.Tools.Test;

public class HeapSort<T extends Comparable<T>> extends Sort<T> {
    /**
     * parent: (i-1)/2
     * 
     * left child: 2 * p + 1
     * 
     * right child: 2 * p + 2
     */
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        // 1. Build MAX Heap
        for (int k = N / 2; k >= 0; k--)
            heapify(nums, k, N);
        // 2. Extraction
        int index = N - 1;
        while (index > 0) {
            swap(nums, 0, index);
            heapify(nums, 0, index);
            index--;
        }
    }

    private void heapify(T[] nums, int k, int N) {
        // Make sure its child/children is/are within the heap
        while (2 * k < (N - 1)) {
            int j = 2 * k + 1;// left child
            if (j < N - 1 && less(nums[j], nums[j + 1])) {
                // Find the max children from this parent
                j++;
            }

            if (less(nums[k], nums[j]) == false) {
                // If parent is less than its children then break
                break;
            }

            swap(nums, k, j);// Swap Parent with max child
            k = j;
        }
    }

    public static void main(String[] args) {
        HeapSort<Integer> heapSort = new HeapSort<>();
        heapSort.sort(Test.TEST1);
        System.out.println(Arrays.toString(Test.TEST1));
    }
}
