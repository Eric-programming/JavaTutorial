import java.util.Arrays;

import AbstractClass.Sort;
import Tools.Test;

public class SelectionSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (less(nums[j], nums[minValueIndex])) {
                    minValueIndex = j;
                }
            }
            swap(nums, minValueIndex, i);
        }
    }

    public static void main(String[] args) {
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.sort(Test.TEST1);// [0, 2, 3, 4, 5, 8, 9]
        System.out.println(Arrays.toString(Test.TEST1));
    }
}