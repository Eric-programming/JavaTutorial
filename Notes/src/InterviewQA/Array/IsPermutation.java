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
     * Time complexity: nlogn
     */
    public static boolean IsPermutation_worst(String t1, String t2) {
        char[] t1CharArr = t1.toCharArray();

        char[] t2CharArr = t2.toCharArray();

        Arrays.sort(t1CharArr);

        Arrays.sort(t2CharArr);

        return Arrays.equals(t1CharArr, t2CharArr);
    }

    /**
     * Good Solution
     *
     * Time complexity: n
     */

    public static boolean IsPermutation_Good(String t1, String t2) {
        char[] t1CharArr = t1.toCharArray();

        char[] t2CharArr = t2.toCharArray();

        int t1Total = 0, t2Total = 0;
        for (int i = 0; i < t1CharArr.length; i++) {
            t1Total += t1CharArr[i];
        }
        for (int i = 0; i < t2CharArr.length; i++) {
            t2Total += t2CharArr[i];
        }
        return t1Total == t2Total;
    }
}