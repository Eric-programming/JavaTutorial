package InterviewQA.Array;

import java.util.Arrays;

/**
 * Write a function to check whether two given strings are Permutation of each
 * other or not. A Permutation of a string is another string that contains same
 * characters, only the order of characters can be different. For example,
 * “abcd” and “dabc” are Permutation of each other.
 */
public class IsPermutation {
    public static void main(String[] args) {
        String t1 = "acd";
        String t2 = "swd";
        String t3 = "dca";

        System.out.println(IsPermutation_Good(t1, t2));// false

        System.out.println(IsPermutation_Good(t2, t3));// false

        System.out.println(IsPermutation_Good(t1, t3));// true

    }

    /**
     * Worst Solution
     *
     * Time Complexity = nlogn
     */
    public static boolean IsPermutation_worst(String t1, String t2) {
        char[] t1Arr = t1.toCharArray();

        char[] t2Arr = t2.toCharArray();

        Arrays.sort(t1Arr);

        Arrays.sort(t2Arr);

        return Arrays.equals(t1Arr, t2Arr);

    }

    /**
     * Good Solution
     * 
     * Time complexity = n
     */

    public static boolean IsPermutation_Good(String t1, String t2) {
        char[] t1Arr = t1.toCharArray();

        char[] t2Arr = t2.toCharArray();

        int totalT1 = 0;

        int totalT2 = 0;

        for (int i = 0; i < t1Arr.length; i++) {
            totalT1 += (int) t1Arr[i];
        }
        for (int i = 0; i < t2Arr.length; i++) {
            totalT2 += (int) t2Arr[i];
        }
        return totalT1 == totalT2;

    }
}