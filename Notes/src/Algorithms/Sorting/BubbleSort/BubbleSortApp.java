package Algorithms.Sorting.BubbleSort;

import java.util.Arrays;

/**
 * Bubble sort is a sorting algo to continously swapping the adjacent elements
 * if they are in wrong order
 */
public class BubbleSortApp {
    public static void main(String[] args) {
        int[] intArr = { 6, 4, 1, 2, 5 };
        System.out.println(Arrays.toString(BubbleSortMethod(intArr)));
    }

    /**
     * 
     * Procedure BubbleSortMethod (a)
     * 
     * Inputs: a (array)
     * 
     * Output: sorted array in ascending order
     * 
     * 1) set iterations = a.length-1
     * 
     * 2) while iterations > 0 do the followings
     * 
     * a. for i = 0 to iterations - 1 then if(a[i] > a[i+1]) then swap them
     * 
     * b. iterations decrement by 1
     * 
     * 2) return the sorted a.
     */
    public static int[] BubbleSortMethod(int[] a) {
        int iterations = a.length - 1;
        while (iterations > 0) {
            for (int i = 0; i < iterations - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            iterations--;
        }
        return a;
    }
}