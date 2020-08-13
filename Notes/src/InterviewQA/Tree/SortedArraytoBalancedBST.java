package InterviewQA.Tree;

import DataStructure.Tree.BinarySearchTrees.BinarySearchTree;

/**
 * Given a sorted array. Write a function that creates a Balanced Binary Search
 * Tree using array elements.
 */
public class SortedArraytoBalancedBST {

    public static void main(String[] args) {
        int[] test1 = { 1, 2, 3, 4, 5, 6, 7 };

        int[] test2 = { 7, 6, 5, 4, 3, 2, 1 };

        int[] test3 = { 1, 3, 5, 7, 9, 11 };

        SortedArraytoBalancedBSTMethod(test1);

        SortedArraytoBalancedBSTMethod(test2);

        SortedArraytoBalancedBSTMethod(test3);

    }

    static final int DUMMY_VALUE = -1;

    private static void SortedArraytoBalancedBSTMethodRecur(BinarySearchTree<Integer> bst, int[] arr, int minIndex,
            int maxIndex) {
        if (minIndex <= maxIndex) {
            int midIndex = (int) Math.ceil((minIndex + maxIndex) / 2.0);// round up

            bst.insert(arr[midIndex], DUMMY_VALUE);

            SortedArraytoBalancedBSTMethodRecur(bst, arr, minIndex, midIndex - 1);// deal with left side of the midindex

            SortedArraytoBalancedBSTMethodRecur(bst, arr, midIndex + 1, maxIndex);// deal with right side of the
                                                                                  // midindex

        }
    }

    public static void SortedArraytoBalancedBSTMethod(int[] arr) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        int minIndex = 0;
        int maxIndex = arr.length - 1;

        SortedArraytoBalancedBSTMethodRecur(bst, arr, minIndex, maxIndex);
    }
}