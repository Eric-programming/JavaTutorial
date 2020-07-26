package DataStructure.HashTable;

public class HashTableNode {
    private int key;
    private Object value;
    private HashTableNode next = null;

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public HashTableNode getNext() {
        return this.next;
    }

    public void setNext(HashTableNode next) {
        this.next = next;
    }

    public HashTableNode() {
        super();
    }

    public HashTableNode(int key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }
}