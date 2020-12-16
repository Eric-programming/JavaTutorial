import java.util.Arrays;

import AbstractClass.Sort;
import Tools.Test;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(T[] nums, int Start, int End) {
        if (Start >= End) {
            return;
        }
        int pivotIndex = (Start + End) / 2;
        int Mid = partition(nums, Start, End, pivotIndex);
        sort(nums, Start, Mid - 1);
        sort(nums, Mid, End);
    }

    private int partition(T[] nums, int Left, int Right, int pivotIndex) {
        while (Left <= Right) {
            while (less(nums[Left], nums[pivotIndex])) {
                Left++;
            }
            while (less(nums[pivotIndex], nums[Right])) {
                Right--;
            }
            if (Left <= Right) {
                // nums[Left] >= nums[pivotIndex] && nums[Right] <= nums[pivotIndex]
                swap(nums, Left, Right);
                Left++;
                Right--;
            }
        }
        return Left;
    }

    public static void main(String[] args) {
        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.sort(Test.TEST1);
        System.out.println(Arrays.toString(Test.TEST1));
    }
}
