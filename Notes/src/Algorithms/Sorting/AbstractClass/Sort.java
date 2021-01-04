package Algorithms.Sorting.AbstractClass;

/**
 * Sort
 */

public abstract class Sort<T extends Comparable<T>> {

    public abstract void sort(T[] nums);

    protected boolean less(T v1, T v2) {
        return v1.compareTo(v2) < 0;// if v2 > v1 then true else false
        /**
         * if v1 > v2, it returns positive number
         * 
         * if v1 < v2, it returns negative number
         * 
         * if v1 == v2, it returns 0
         */
    }

    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}