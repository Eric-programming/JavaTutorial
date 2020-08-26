package InterviewQA.DP.ClimbingStairs;

import java.util.*;

/**
 * ClimbingStairMethod(4) = ClimbingStairMethod(3) + ClimbingStairMethod(2)
 * 
 * ClimbingStairMethod(n) = ClimbingStairMethod(n-1) + ClimbingStairMethod(n-2)
 */

public class ClimbingStairs {
    public static void main(String[] args) {

        // System.out.println(ClimbingStairMethod(1));
        // System.out.println(ClimbingStairMethod(2));
        // System.out.println(ClimbingStairMethod(3));
        // System.out.println(ClimbingStairMethod(4));
        // System.out.println(ClimbingStairMethod(5));
        /////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
        System.out.println(ClimbingStairMethod_2(1));// 1
        System.out.println(ClimbingStairMethod_2(2));// 2
        System.out.println(ClimbingStairMethod_2(3));// 3
        System.out.println(ClimbingStairMethod_2(4));// 5
        System.out.println(ClimbingStairMethod_2(5));// 8

    }

    public static int ClimbingStairMethod(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return ClimbingStairMethod(n, map);
    }

    public static int ClimbingStairMethod(int n, Map<Integer, Integer> map) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (map.get(n) != null) {
            return map.get(n);
        }
        int v = ClimbingStairMethod(n - 1, map) + ClimbingStairMethod(n - 2, map);
        map.put(n, v);
        return v;
    }

    public static int ClimbingStairMethod_2(int n) {
        if (n <= 3) {
            return n;
        }

        // From now on: n >= 4

        int p2 = 2, p1 = 3, i;
        for (i = 3; i < n; i++) {
            int cur = p1 + p2;
            p2 = p1;
            p1 = cur;
        }
        return p1;
    }
}