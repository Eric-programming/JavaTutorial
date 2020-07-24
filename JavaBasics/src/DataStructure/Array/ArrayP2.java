package DataStructure.Array;

import java.util.Arrays;

//2d array contains elements arranged in rows and columns.
//int[][] a = new int[2][4] there are 2 rows and 4 columns
/**
 * ArrayP2 Spiral Matrix
 */
public class ArrayP2 {
    public static void main(String[] args) {
        int[][] twodarr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
        System.out.println(Arrays.toString(print_spiral_matrix(twodarr, twodarr.length, twodarr[0].length)));
    }

    /**
     * Bad Solution
     * 
     * Pseudocode Print Spiral Matrix
     * 
     * Complexity: n(n+n+n) = n^2 + n^2 +n^2= 3n^2 = n^2
     * 
     * Procedure print_spiral_matrix(aa)
     * 
     * Inputs: aa (2d array)
     * 
     * Outputs: 1d array
     * 
     * 1) set a = array with size of rows * columns, pointer = 0
     * 
     * set rs = 0, re = rows - 1, cs = 0, ce = columns -1
     * 
     * 2) while rs < re and cs < ce do the followings
     * 
     * //go to right
     * 
     * for each index i going form cs to ce. a[pointer] = aa[rs][i] and pointer
     * increment by 1
     * 
     * //go down
     * 
     * for each index i going from rs + 1 to re. a[pointer] = aa[i][ce] and pointer
     * increment by 1
     * 
     * 
     * //go left
     * 
     * for each index i going form ce - 1 to cs. a[pointer] = aa[rs][i] and pointer
     * increment by 1
     * 
     * //go up
     * 
     * for each index i going form re -1 to rs+1. a[pointer] = aa[i][cs] and pointer
     * increment by 1
     * 
     * //Shrink the squre
     * 
     * rs increment by 1, re decrement by 1, cs increment by 1, ce decrement by 1
     * 
     * 3) return a
     */

    public static int[] print_spiral_matrix(int[][] aa, int rows, int columns) {
        int[] a = new int[rows * columns];
        int rs = 0, re = rows - 1, cs = 0, ce = columns - 1, pointer = 0;
        while (rs < re && cs < ce) {
            // right
            for (int i = cs; i <= ce; i++) {
                a[pointer] = aa[rs][i];
                pointer++;
            }
            // down
            for (int i = rs + 1; i <= re; i++) {
                a[pointer] = aa[i][ce];
                pointer++;
            }
            // left
            for (int i = ce - 1; i >= cs; i--) {
                a[pointer] = aa[re][i];
                pointer++;
            }
            // up
            for (int i = re - 1; i >= rs + 1; i--) {
                a[pointer] = aa[i][cs];
                pointer++;
            }
            // Shrink the square
            rs++;
            re--;
            cs++;
            ce--;
        }

        return a;
    }
}
