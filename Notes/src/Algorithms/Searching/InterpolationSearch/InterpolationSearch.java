package Algorithms.Searching.InterpolationSearch;

/**
 * Binary Search > Interpolation search when the data is not equaly distrubed
 */
public class InterpolationSearch {
    public static void main(String[] args) {
        // Equations: pos = lowIndex + [ (x-arr[lowIndex])*(highIndex-lowIndex) /
        // (arr[highIndex]-arr[lowIndex]) ]

        int[] intArray = { 2, 4, 6, 8, 10, 12 };// equally distrubed and sorted

        System.out.println("Index for value 6 is " + InterpolationSearchMethod(intArray, 6));
        System.out.println("Index for value 2 is " + InterpolationSearchMethod(intArray, 2));
        System.out.println("Index for value 8 is " + InterpolationSearchMethod(intArray, 8));
        System.out.println("Index for value 12 is " + InterpolationSearchMethod(intArray, 12));
        System.out.println("Index for value 4 is " + InterpolationSearchMethod(intArray, 4));

        System.out.println("///////////////////////////////////////////////////////////");

        int[] intArray2 = { 2, 5, 6, 9, 10, 15 };// Not equally distrubed
        int low = 0;
        int high = intArray2.length - 1;
        System.out.println("Index for value 2 is " + InterpolationSearchMethodRecur(intArray2, 2, low, high));
        System.out.println("Index for value 5 is " + InterpolationSearchMethodRecur(intArray2, 5, low, high));
        System.out.println("Index for value 6 is " + InterpolationSearchMethodRecur(intArray2, 6, low, high));
        System.out.println("Index for value 15 is " + InterpolationSearchMethodRecur(intArray2, 15, low, high));
        System.out.println("Index for value 10 is " + InterpolationSearchMethodRecur(intArray2, 10, low, high));
    }

    public static int InterpolationSearchMethod(int[] arr, int x) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int index = lowIndex + (x - arr[lowIndex]) * (highIndex - lowIndex) / (arr[highIndex] - arr[lowIndex]);
        return index;
    }

    /**
     * What if the array is not equally distrubed?
     */
    public static int InterpolationSearchMethodRecur(int[] arr, int x, int lowIndex, int highIndex) {
        if (lowIndex <= highIndex && x >= arr[lowIndex] && x <= arr[highIndex]) {
            // #1 If lowIndex and highIndex are same
            if (lowIndex == highIndex) {
                if (arr[lowIndex] == x)
                    return lowIndex;
                return -1;
            }

            int pos = lowIndex + (x - arr[lowIndex]) * (highIndex - lowIndex) / (arr[highIndex] - arr[lowIndex]);

            // #2 If found
            if (arr[pos] == x)
                return pos;

            // #3 If x is bigger than arr at position found
            if (arr[pos] < x)
                return InterpolationSearchMethodRecur(arr, x, pos + 1, highIndex);

            // #4 If x is smaller than arr at position found
            else
                return InterpolationSearchMethodRecur(arr, x, lowIndex, pos - 1);
        }
        return -1;
    }
}