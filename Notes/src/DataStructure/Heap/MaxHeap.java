package DataStructure.Heap;

import java.util.ArrayList;
import java.util.List;

//Formula find left child: 2i+1
//Formula find right child: 2i+2
//Formula find parent index: ((i - 1) / 2)
public class MaxHeap {
    public static void main(String[] args) {
        int[] arr = { 100, -1000, 10000, -10, 10001 };
        MaxHeap mh = new MaxHeap();
        for (int item : arr) {
            mh.add(item);
        }
        mh.print();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("We remove => " + mh.poll());
            mh.print();
        }

    }

    private List<Integer> list;

    public MaxHeap() {
        super();
        list = new ArrayList<>();
    }

    public int peek() {
        if (list.size() == 0)
            throw new IllegalStateException();
        return list.get(0);
    }

    public int poll() {
        if (list.size() == 0)
            throw new IllegalStateException();
        int item = list.get(0);
        if (list.size() == 1) {
            list.remove(0);
            return item;
        }
        int lastIndex = list.size() - 1;
        int lastItem = list.get(lastIndex);
        list.set(0, lastItem);
        list.remove(lastIndex);
        heapifyDown();
        return item;
    }

    public void add(int item) {
        list.add(item);
        heapifyUp();
    }

    private void heapifyDown() {
        int curIndex = 0;
        int left = hasLeftChild(curIndex) ? leftChild(curIndex) : Integer.MIN_VALUE;
        int right = hasRightChild(curIndex) ? rightChild(curIndex) : Integer.MIN_VALUE;
        while (Math.max(left, right) > list.get(curIndex)) {
            if (left > right) {
                swap(curIndex, getLeftChildIndex(curIndex));
                curIndex = getLeftChildIndex(curIndex);
            } else {
                swap(curIndex, getRightChildIndex(curIndex));
                curIndex = getRightChildIndex(curIndex);
            }
            left = hasLeftChild(curIndex) ? leftChild(curIndex) : Integer.MIN_VALUE;
            right = hasRightChild(curIndex) ? rightChild(curIndex) : Integer.MIN_VALUE;
        }
    }

    private void heapifyUp() {
        int curIndex = list.size() - 1;
        int curVal = list.get(curIndex);
        while (hasParent(curIndex) && parent(curIndex) < curVal) {
            swap(getParentIndex(curIndex), curIndex);
            curIndex = getParentIndex(curIndex);
        }
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < list.size();
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < list.size();
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int leftChild(int index) {
        return list.get(getLeftChildIndex(index));
    }

    private int rightChild(int index) {
        return list.get(getRightChildIndex(index));
    }

    private int parent(int index) {
        return list.get(getParentIndex(index));
    }

    private void swap(int aIndex, int bIndex) {
        int temp = list.get(aIndex);
        list.set(aIndex, list.get(bIndex));
        list.set(bIndex, temp);
    }

    public void print() {
        System.out.println(list.toString());
    }

}