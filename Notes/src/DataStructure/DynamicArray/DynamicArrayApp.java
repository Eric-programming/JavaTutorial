package DynamicArray;

/**
 * Dynamic Array is an array that can resize itself instead of fixed length. It
 * still provides Constant time or O(1) access just like array.
 */
public class DynamicArrayApp {
    public static void main(String[] args) {
        long[] longArr = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        useDynamicArrayDemo(longArr);
    }

    public static void useDynamicArrayDemo(long[] longArr) {
        DynamicArrayClass dynamicArrayDemo = new DynamicArrayClass();
        for (int i = 0; i < longArr.length; i++) {
            dynamicArrayDemo.put(longArr[i]);
            System.out.println(dynamicArrayDemo);
        }
        System.out.println(dynamicArrayDemo);
        for (int i = 0; i < longArr.length; i++) {
            dynamicArrayDemo.remove();
            System.out.println(dynamicArrayDemo);
        }
    }
}