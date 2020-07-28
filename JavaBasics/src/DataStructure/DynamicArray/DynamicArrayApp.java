package DataStructure.DynamicArray;

import java.util.ArrayList;

public class DynamicArrayApp {
    public static void main(String[] args) {
        long[] longArr = new long[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        useDynamicArrayDemo(longArr);
        // useArrayList(longArr);
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

    public static void useArrayList(long[] longArr) {
        ArrayList<Long> arrList = new ArrayList<>();
        for (int i = 0; i < longArr.length; i++) {
            arrList.add(longArr[i]);
            System.out.println(arrList);
        }
        System.out.println(arrList);
        for (int i = longArr.length - 1; i > 0; i--) {
            arrList.remove(i);
            System.out.println(arrList);
        }
    }
}