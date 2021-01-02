package Heap;

public class HeapNode {
    private int key;

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public HeapNode(int k) {
        super();
        this.key = k;
    }
}