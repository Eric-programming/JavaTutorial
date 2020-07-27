package DataStructure.DynamicArray;

import java.util.Arrays;

/**
 * Search O(n)
 * 
 * Delete O(n)
 * 
 * Insert O(n)
 * 
 * Access O(1)
 * 
 * Pros: save space and no fixed size
 */
public class DynamicArrayClass {
    Long[] arr;
    int currentIndex;

    public DynamicArrayClass() {
        super();
        arr = new Long[1];
        currentIndex = -1;
    }

    public int getSize() {
        return arr.length;
    }

    public long getValue(int index) {
        return arr[index];
    }

    public void put(long element) {
        ensureCapacity();
        arr[++currentIndex] = element;// first increment by 1 then assign value
    }

    private void ensureCapacity() {
        int lastIndex = getSize();
        if (currentIndex == lastIndex - 1) {
            // expand the array if full
            arr = Arrays.copyOf(arr, lastIndex * 2);
        } else if (currentIndex < lastIndex / 2 && currentIndex > -1) {
            // Ensure there is at least 1 element in array
            arr = Arrays.copyOf(arr, Math.max(lastIndex / 2, 1));
        }
    }

    public void remove() {
        if (arr.length > 0) {
            arr[currentIndex--] = null;// first assign value then decrement by 1
            ensureCapacity();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}