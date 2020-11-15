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
        // ===============================================
        int[] items = { 3, 4, 2, 1 };
        items = merge_sort(items);// 1234
        System.out.println(Arrays.toString(items));

        // ===============================================
        int[] items2 = { 4, 3, 2, 1 };
        items2 = merge_sort(items2);// 1234
        System.out.println(Arrays.toString(items2));

        // ===============================================
        int[] items3 = { 6, 1, 0, 3, 2 };// 01236
        items3 = merge_sort(items3);
        System.out.println(Arrays.toString(items3));
    }

    public static int[] merge_sort(int[] input) {
        if (input.length <= 1) {
            return input;// Filter data
        }
        int pivot = input.length / 2;// Round down
        int[] left_list = merge_sort(Arrays.copyOfRange(input, 0, pivot));
        int[] right_list = merge_sort(Arrays.copyOfRange(input, pivot, input.length));
        return merge(left_list, right_list);
    }

    private static int[] merge(int[] left_list, int[] right_list) {
        int[] finalArr = new int[left_list.length + right_list.length];
        int left_cursor = 0, right_cursor = 0, final_cursor = 0;

        while (left_cursor < left_list.length && right_cursor < right_list.length) {
            if (left_list[left_cursor] < right_list[right_cursor]) {
                finalArr[final_cursor++] = left_list[left_cursor++];// i++ vs ++i
            } else {
                finalArr[final_cursor++] = right_list[right_cursor++];
            }
        }
        // append the remaining items to finalArr
        while (left_cursor < left_list.length) {
            finalArr[final_cursor++] = left_list[left_cursor++];
        }
        while (right_cursor < right_list.length) {
            finalArr[final_cursor++] = right_list[right_cursor++];
        }
        return finalArr;
    }
}