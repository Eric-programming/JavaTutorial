package InterviewQA.Array;

import java.util.Hashtable;

/**
 * Given a string, determine if a permutation of the string could form a
 * palindrome.
 * 
 * Input: "aab" => true
 * 
 * Input: "code" => false
 * 
 * Input: "careracc" => false
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        String t1 = "aab";
        System.out.println(PalindromePermutation_countUniqueChar_2(t1));// true
        String t2 = "code";
        System.out.println(PalindromePermutation_countUniqueChar_2(t2));// false
        String t3 = "careracc";
        System.out.println(PalindromePermutation_countUniqueChar_2(t3));// false

        String t4 = "cccccccccc";
        System.out.println(PalindromePermutation_countUniqueChar_2(t4));// true
    }

    /**
     * Array
     * 
     * Time complexity = n
     */
    public static boolean PalindromePermutation_countUniqueChar(String t) {
        char[] charArr = t.toCharArray();

        int[] allChar = new int[128];

        int count = 0;

        for (int i = 0; i < charArr.length; i++) {
            int index = charArr[i];
            allChar[index]++;
            if (allChar[index] % 2 == 0) {
                // even number
                count--;
            } else {
                count++;// odd number
            }
        }
        return count <= 1;
    }

    /**
     * HashTable
     * 
     * Time complexity: n
     */
    public static boolean PalindromePermutation_countUniqueChar_2(String t) {
        char[] charArr = t.toCharArray();
        Hashtable<Character, Integer> cht = new Hashtable<>();
        int count = 0;

        for (int i = 0; i < charArr.length; i++) {
            char key = charArr[i];
            cht.computeIfAbsent(key, j -> 0);
            cht.put(key, cht.get(key) + 1);
            if (cht.get(key) % 2 == 0) {
                // even number
                count--;
            } else {
                count++;
            }
        }
        return count <= 1;
    }

}