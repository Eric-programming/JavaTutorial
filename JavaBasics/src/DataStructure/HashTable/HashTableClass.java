package DataStructure.HashTable;

public class HashTableClass {
    private HashTableNode[] arr;

    public HashTableClass(int size) {
        super();
        arr = new HashTableNode[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new HashTableNode();
        }
    }

    private int getHash(int key) {
        return key % arr.length;
    }

    public void put(int key, Object value) {
        int hashcodeIndex = getHash(key);
        HashTableNode n = new HashTableNode(key, value);
        n.setNext(arr[hashcodeIndex]);// Insert from first
        arr[hashcodeIndex] = n;
    }

    public HashTableNode getValue(int key) {
        int hashcodeIndex = getHash(key);
        HashTableNode head = arr[hashcodeIndex];
        while (head.getNext() != null) {
            if (head.getKey() == key) {
                return head;
            }
        }
        return null;
    }

    public void removeValue(int key) {
        int hashcodeIndex = getHash(key);
        HashTableNode head = arr[hashcodeIndex];
        // Ignore the first node if key is the same
        if (head.getKey() == key) {
            arr[hashcodeIndex] = head.getNext();
        } else {
            while (head.getNext() != null) {
                if (head.getNext().getKey() == key) {
                    head.setNext(head.getNext().getNext());
                    System.out.println("Delete successful");
                    break;
                }
            }
        }

    }
}