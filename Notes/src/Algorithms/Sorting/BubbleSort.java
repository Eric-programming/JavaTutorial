import java.util.Arrays;

import Tools.Test;
import AbstractClass.Sort;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (less(nums[j], nums[j + 1]) == false) {
                    swap(nums, j + 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort<Integer> BubbleSort = new BubbleSort<>();
        BubbleSort.sort(Test.TEST1);
        System.out.println(Arrays.toString(Test.TEST1));
    }
}
