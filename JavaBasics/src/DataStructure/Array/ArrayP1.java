package DataStructure.Array;

import java.util.ArrayList;

//Array: a group of similar type variables. It can contains primitives and non-primitivies
//ex. int[] name = new int[2] {1,2};
/**
 * ArrayP1
 */
public class ArrayP1 {

    public static void main(String[] args) {
        int[] t1 = { 1, 1, 1, 0, 0 };// 4

        System.out.println(find_longest_sequence_of_1s_with_one_flip_2(t1));

        int[] t2 = { 0, 0, 0, 1, 1 };// 3

        System.out.println(find_longest_sequence_of_1s_with_one_flip_2(t2));

        int[] t3 = { 0, 0, 0, 0, 0 }; // 1

        System.out.println(find_longest_sequence_of_1s_with_one_flip_2(t3));

        int[] t4 = { 1, 0, 1, 0, 1 }; // 3

        System.out.println(find_longest_sequence_of_1s_with_one_flip_2(t4));

        int[] t5 = { 1, 1, 1, 1, 1 }; // 0

        System.out.println(find_longest_sequence_of_1s_with_one_flip_2(t5));

        int[] t6 = { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 }; // 7

        System.out.println(find_longest_sequence_of_1s_with_one_flip_2(t6));

    }

    public static final int ONE = 1;

    /**
     * Bad Solution
     * 
     * Pseudocode Find the longest sequence of 1s with one flip
     * 
     * Complexity: n(n+n) = n^2 + n^2 = 2n^2 = n^2
     * 
     * Procedure find_longest_sequence_of_1s_with_one_flip(a)
     * 
     * Inputs: a (array)
     * 
     * Outputs: longest sequence
     * 
     * 1) set max = 0
     * 
     * 2) For each index i going from 0 to a.length. If a[i] = 0,
     * 
     * then set count = 1
     * 
     * for each index l = i -1 to 0, if a[l] = 1 then count increment by 1
     * 
     * for each index r = i + 1 to a.length - 1, if a[r] = 1 then count increment by
     * 1
     * 
     * if max < count then max = count
     * 
     * 3) return max
     */

    public static int find_longest_sequence_of_1s_with_one_flip(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ONE) {
                continue;
            }
            int count = 1;

            for (int l = i - 1; l > -1; l--) {
                if (a[l] == ONE) {
                    count++;
                } else {
                    break;
                }
            }
            for (int r = i + 1; r < a.length; r++) {
                if (a[r] == ONE) {
                    count++;
                } else {
                    break;
                }
            }
            max = max < count ? count : max;
        }
        return max;
    }

    /**
     * Good Solution
     * 
     * Pseudocode Find the longest sequence of 1s with one flip 2
     * 
     * Complexity: n+n = 2n = n
     * 
     * Procedure find_longest_sequence_of_1s_with_one_flip_2(a)
     * 
     * Inputs: a (array)
     * 
     * Outputs: longest sequence
     * 
     * 1) set max = 0, temp = 0, tempA = new array list
     * 
     * 2) For each index i going from 0 to a.length. If a[i] = 1, then temp
     * increment by 1 then continue
     * 
     * if temp > 0 then we add temp to tempA and set temp = 0
     * 
     * tempA add 0
     * 
     * 3) if temp > 0 then add temp to tempA
     * 
     * 4)For each index i going from 0 to tempA.size(). If tempA.get(i) > 0 , then
     * continue
     * 
     * set count = 1
     * 
     * if i > 0 then count = count + tempA.get(i-1)
     * 
     * if i < tempA.size -1 then count = count + tempA.get(i+1)
     * 
     * if max < count then max = count;
     * 
     * 5) return max
     */

    public static int find_longest_sequence_of_1s_with_one_flip_2(int[] a) {
        int max = 0;
        int temp = 0;
        ArrayList<Integer> tempA = new ArrayList<>();// Good for storing and accessing data compare to Linkedlist
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ONE) {
                temp++;
                continue;
            }
            // If something is there then
            if (temp > 0) {
                tempA.add(temp);
                temp = 0;
            }
            tempA.add(0);

        }
        // Clean up
        if (temp > 0) {
            tempA.add(temp);
        }
        for (int i = 0; i < tempA.size(); i++) {
            if (tempA.get(i) > 0) {
                continue;
            }
            int count = 1;
            // add left
            if (i > 0) {
                count += tempA.get(i - 1);
            }
            // add the right
            if (i < tempA.size() - 1) {
                count += tempA.get(i + 1);
            }
            max = max < count ? count : max;
        }
        return max;
    }
}