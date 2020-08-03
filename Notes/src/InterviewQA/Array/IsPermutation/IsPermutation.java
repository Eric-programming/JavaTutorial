package InterviewQA.Array.IsPermutation;

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

        System.out.println(SolutionIsPermutation(t1, t2));

        System.out.println(SolutionIsPermutation(t2, t3));
    }

    /**
     * 
     */
    public static boolean SolutionIsPermutation(String t1, String t2) {
        boolean result = false;
        // Solution here

        return result;
    }
}