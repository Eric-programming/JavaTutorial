// package InterviewQA.Array.IsPermutation;

// import java.util.Arrays;

// public class Solution_IsPermutation {
// public static void main(String[] args) {
// String t1 = "acd";
// String t2 = "swd";
// String t3 = "dca";

// System.out.println(sortAndThenCompare(t1, t2));

// System.out.println(sortAndThenCompare(t2, t3));
// }

// /**
// * Sort it first and then compare the array
// *
// * Time Complexity: nlogn
// */
// public static boolean sortAndThenCompare(String t1, String t2) {
// boolean result = false;
// // Solution here
// char[] t1Arr = t1.toCharArray();
// char[] t2Arr = t2.toCharArray();

// Arrays.sort(t1Arr);// Quick sort = nlogn
// Arrays.sort(t2Arr);

// if (t1Arr.equals(t2Arr)) {
// result = false;
// } else {
// result = true;
// }

// return result;
// }

// /**
// * Sort it first and then compare the array
// *
// * Time Complexity: nlogn
// */
// public static boolean sortAndThenCompare(String t1, String t2) {
// boolean result = false;
// // Solution here
// char[] t1Arr = t1.toCharArray();
// char[] t2Arr = t2.toCharArray();

// Arrays.sort(t1Arr);// Quick sort = nlogn
// Arrays.sort(t2Arr);

// if (t1Arr.equals(t2Arr)) {
// result = false;
// } else {
// result = true;
// }

// return result;
// }

// }