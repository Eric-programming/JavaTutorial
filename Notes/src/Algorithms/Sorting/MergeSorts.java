package Algorithms.Sorting;

import java.util.Arrays;

import Algorithms.Sorting.AbstractClass.Sort;
import Algorithms.Sorting.Tools.Test;

public class MergeSorts<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        helper = (T[]) new Comparable[nums.length];
        sort(nums, 0, nums.length - 1);
    }

    private void sort(T[] nums, int Start, int End) {
        if (End <= Start) {
            return;
        }
        int mid = Start + (End - Start) / 2;
        sort(nums, Start, mid);
        sort(nums, mid + 1, End);
        merge(nums, Start, mid, End);
    }

    private T[] helper;

    private void merge(T[] nums, int Start, int mid, int End) {

        int L = Start, R = mid + 1;

        for (int k = Start; k <= End; k++) {
            helper[k] = nums[k];
        }

        for (int k = Start; k <= End; k++) {
            if (L > mid) {
                // Get remaining element on the right subarray
                nums[k] = helper[R++];

            } else if (R > End) {
                // Get remaining element on the left subarray
                nums[k] = helper[L++];
            } else if (helper[L].compareTo(helper[R]) <= 0) {
                // If left is <= right then add the left element
                nums[k] = helper[L++];
            } else {
                // If right is < left then add the right element
                nums[k] = helper[R++];
            }
        }

    }

    public static void main(String[] args) {
        MergeSorts<Integer> mSorts = new MergeSorts<>();
        mSorts.sort(Test.TEST1);
        System.out.println(Arrays.toString(Test.TEST1));
    }

}