package DataStructure.HashTable.DemoHashTable;

/**
 * Hashing has on average O(1) time complexity when insert, delete, seach
 */
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
        HashTableNode head = arr[hashcodeIndex];
        boolean insert = true;
        while (head.getNext() != null) {
            if (key == head.getKey()) {
                head.setValue(value);
                insert = false;
                break;
            }
            head = head.getNext();
        }
        if (insert) {
            HashTableNode n = new HashTableNode(key, value);
            n.setNext(arr[hashcodeIndex]);// Insert from first
            arr[hashcodeIndex] = n;
        }
    }

    public Object getValue(int key) {
        int hashcodeIndex = getHash(key);
        HashTableNode head = arr[hashcodeIndex];
        while (head.getNext() != null) {
            if (head.getKey() == key) {
                return head.getValue();
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