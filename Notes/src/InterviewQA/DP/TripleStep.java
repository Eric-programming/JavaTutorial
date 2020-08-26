package InterviewQA.DP;

import java.util.*;

/**
 * Triple Step: A child is running up a staircase with n steps and can hop
 * either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how
 * many possible ways the child can run up the stairs.
 */
public class TripleStep {
    public static void main(String[] args) {
        int n = 3;// 4
        int n1 = 4; // 7

        System.out.println(TripleStepMethodWithMemoization(n));
    }

    public static int TripleStepMethod(int n) {
        if (n > 0) {
            return TripleStepMethod(n - 1) + TripleStepMethod(n - 2) + TripleStepMethod(n - 3);
        }
        if (n == 0) {
            return 1;
        }
        return 0;
    }

    public static int TripleStepMethodWithMemoization(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 0);
        return TripleStepMethodWithMemoization(n, arr);
    }

    public static int TripleStepMethodWithMemoization(int n, int[] arr) {
        if (arr[n] != 0) {
            return arr[n];
        }
        if (n > 0) {
            arr[n] = TripleStepMethod(n - 1) + TripleStepMethod(n - 2) + TripleStepMethod(n - 3);
        }
        if (n == 0) {
            return 1;
        }
        return arr[n];
    }
}