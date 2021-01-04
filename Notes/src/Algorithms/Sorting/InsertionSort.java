package Algorithms.Sorting;

import java.util.Arrays;

import Algorithms.Sorting.AbstractClass.Sort;
import Algorithms.Sorting.Tools.Test;

public class InsertionSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
                swap(nums, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(Test.TEST1);// [0, 2, 3, 4, 5, 8, 9]
        System.out.println(Arrays.toString(Test.TEST1));
    }
}
