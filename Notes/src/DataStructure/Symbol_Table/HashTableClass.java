package DataStructure.Symbol_Table;

import java.util.ArrayList;

/**
 * Time complexity: O(1) Average Worst case: O(n)
 */
public class HashTableClass<Key, Value> implements UnorderedST<Key, Value> {
    private static final int M = 10;

    public static void main(String[] args) {
        HashTableClass<Integer, Integer> ht = new HashTableClass<>();
        for (int i = 0; i < 100; i += 10) {
            ht.put(i, i * 100);
        }
        // Delete
        System.out.println(ht.get(0));
        ht.delete(0);
        System.out.println(ht.get(0));

        // Put
        System.out.println(ht.get(20));
        ht.put(20, 200);
        System.out.println(ht.get(20));

    }

    protected class Node {
        Key key;
        Value val;
        Node next;
    }

    private ArrayList<Node> store;

    private int hash(Key key) {
        return key.toString().hashCode() % M;
    }

    public HashTableClass() {
        super();
        store = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            store.add(null);
        }
    }

    // GET
    public Value get(Key key) {
        int hashCodeIndex = hash(key);
        Node head = store.get(hashCodeIndex);
        while (head != null) {
            if (head.key == key) {
                return head.val;
            }
            head = head.next;
        }
        return null;
    }

    // PUT
    public void put(Key key, Value value) {
        int hashCodeIndex = hash(key);
        Node head = store.get(hashCodeIndex);
        Node temp = head;
        while (temp != null) {
            if (key == temp.key) {
                temp.val = value;// override
                return;
            }
            temp = temp.next;
        }
        Node n = new Node();
        n.key = key;
        n.val = value;
        n.next = head;// insert at first
        store.set(hashCodeIndex, n);
    }

    // DELETE
    public void delete(Key key) {
        int hashcodeIndex = hash(key);
        Node cur = store.get(hashcodeIndex);
        if (cur == null)
            return;
        if (cur.key == key) {
            store.set(hashcodeIndex, cur.next);
        }
        Node pre = cur;
        cur = cur.next;
        while (cur != null) {
            if (cur.key == key) {
                pre.next = cur.next;
                return;
            }
        }
    }

}
