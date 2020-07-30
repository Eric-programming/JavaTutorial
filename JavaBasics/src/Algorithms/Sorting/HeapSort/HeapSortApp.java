package Algorithms.Sorting.HeapSort;

import java.util.Arrays;

//Formula find left child: 2n+1
//Formula find right child: 2n+2
//Formula find parent index: Math.floor((n-1)/2)
public class HeapSortApp {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        sort(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));
    }

    /**
     * 12,11,13,5,6,7
     * 
     * #1 (Convert Max Heap)=> 13,11,12,5,6,7
     * 
     * #2 (set i is the index of the last value in the array)=> set i = arr.length-1
     * 
     * #3 (swap root with arr[i] and then i decrement by 1)=> 7,11,12,5,6,13
     * 
     * #4 From root to arr[i], convert to max leap. Then repeat #2-#3
     */
    public static void sort(int arr[]) {
        int n = arr.length;
        int totalParents = n / 2 - 1; // each parent has a left and right child

        // convert arr to a max heap
        for (int i = totalParents; i >= 0; i--)
            heapify(arr, n, i);

        // One by one sort the arr
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            swap(arr, 0, i);

            // Convert to max heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            swap(arr, largest, i);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }
}