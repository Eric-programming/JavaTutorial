package InterviewQA.Array.IsUnique;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Solution_IsUnique
 * 
 * Given a string unsorted, Determine if the string has all unique characters.
 */
public class Solution_IsUnique {

    public static void main(String[] args) {
        String test1 = "asder30";

        System.out.println(IsUniqueSolution(test1));// return true

        String test2 = "asdddasasd";

        System.out.println(IsUniqueSolution(test2));// return false

    }

    /**
     * Best Solution
     * 
     * Time Complexity: n
     */
    public static boolean IsUniqueSolution(String text) {
        int totalChar = 128;
        // Check the length to make sure that it is less than ASCII Total Characters
        if (text.length() > totalChar) {
            return false;
        }
        boolean[] initArr = new boolean[totalChar];
        for (int i = 0; i < text.length(); i++) {
            int index = (int) text.charAt(i);
            if (initArr[index] == true) {
                return false;
            }
            initArr[index] = true;
        }
        return true;
    }

    /**
     * Okay Solution
     * 
     * Time Complexity: n(Log n) because of Binary Sort
     */
    public static boolean SortCharAndFindDuplicates(String text) {
        // Sort
        char[] arr = text.toCharArray();
        Arrays.sort(arr);

        // Find duplicates if any
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Worst Solution
     * 
     * Time Complexity: n^2
     */
    public static boolean BruteForceSolution(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}