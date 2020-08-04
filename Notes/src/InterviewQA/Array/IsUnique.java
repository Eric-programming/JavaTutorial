package InterviewQA.Array;

import java.util.Arrays;

/**
 * IsUnique
 * 
 * Given a string unsorted, Determine if the string has all unique characters.
 */
public class IsUnique {

    public static void main(String[] args) {
        String test1 = "asder30";

        System.out.println(IsUniqueSolutionBest(test1));// return true

        String test2 = "asdddasasd";

        System.out.println(IsUniqueSolutionBest(test2));// return false

    }

    /**
     * Worst Solution
     * 
     * Brute force
     * 
     * Time complexity = n^2
     */
    public static boolean IsUniqueSolutionWorst(String t1) {
        char[] charArr = t1.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Good Solution
     * 
     * Time complexity: nlogn
     */
    public static boolean IsUniqueSolutionGood(String t1) {
        char[] charArr = t1.toCharArray();
        Arrays.sort(charArr);// nlogn

        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == charArr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Best Solution
     * 
     * Time complexity: n
     */
    public static boolean IsUniqueSolutionBest(String t1) {
        char[] charArr = t1.toCharArray();
        int maxChar = 128;

        if (charArr.length > maxChar) {
            return false;
        }

        boolean[] allChar = new boolean[maxChar];

        for (int i = 0; i < charArr.length; i++) {
            int index = (int) charArr[i];
            if (allChar[index]) {
                return false;
            }
            allChar[index] = true;
        }

        return true;
    }

}