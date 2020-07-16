package DataStructure.Heap;

//Formula: Math.floor((n-1)/2) is equals to the parent index in the array
public class MaxHeap<T> {
    private HeapNode[] heapArr;
    private int currentSize;// Current nodes in arr

    public MaxHeap(int size) {
        super();
        heapArr = new HeapNode[size];
        currentSize = 0;
    }

    public int getHeapSize() {
        return heapArr.length;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize >= heapArr.length;
    }

    public void insert(int key) {
        if (isFull()) {
            System.out.println("Sorry, can't insert because the heap is full");
        } else {
            // Create the node
            HeapNode newNode = new HeapNode(key);
            // assign the new node to the end of the heap
            heapArr[currentSize] = newNode;
            // Compare the node with their parent node to insert correctly
            compareWithParentNode(newNode, currentSize);
            // Increment the index
            currentSize += 1;
        }
    }

    private boolean compareWithParentNode(HeapNode node, int currentIndex) {
        // Compare the value of this node with its parent
        int parentIndex = (currentIndex - 1) / 2;
        // Equal or less than parent value
        if (heapArr[parentIndex].getKey() >= heapArr[currentIndex].getKey()) {
            return true;
        } else {
            // If value of parent is less than child then swap them
            swapValue(currentIndex, parentIndex);
            // Recur
            return compareWithParentNode(node, parentIndex);
        }
    }

    private void swapValue(int fIndex, int sIndex) {
        HeapNode temp = heapArr[fIndex];
        heapArr[fIndex] = heapArr[sIndex];
        heapArr[sIndex] = temp;
    }

    private boolean swapWithLargerChild(HeapNode node, int currentIndex) {
        if (currentIndex < heapArr.length - 1) {
            // Find left child and right child
            int leftChildIndex = (currentIndex + 1) * 2;
            int rightChildIndex = leftChildIndex + 1;

            if (heapArr[leftChildIndex].getKey() > heapArr[rightChildIndex].getKey()) {
                swapValue(currentIndex, leftChildIndex);
                return swapWithLargerChild(heapArr[leftChildIndex], leftChildIndex);
            } else {
                swapValue(currentIndex, rightChildIndex);
                return swapWithLargerChild(heapArr[rightChildIndex], rightChildIndex);
            }
        }
        return true;
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Sorry, can't delete because it is empty");
        } else {
            int rootIndex = 0;
            // Replace root with last element
            heapArr[rootIndex] = heapArr[currentSize];
            currentSize -= 1;
            // swap the largest child with the root value
            swapWithLargerChild(heapArr[rootIndex], 0);
        }
    }
}