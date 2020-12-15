import java.util.ArrayList;
import java.util.List;

public class BSTClass<Key extends Comparable<Key>, Value> implements OrderedST<Key, Value> {
    public static void main(String[] args) {
        BSTClass<Integer, Integer> bst = new BSTClass<>();
        bst.put(4, 0);
        bst.put(2, 0);
        bst.put(6, 0);
        bst.put(1, 0);
        bst.put(3, 30);
        bst.put(5, 0);
        bst.put(7, 0);

        System.out.println(bst.get(3));
        System.out.println(bst.get(11));
    }

    protected Node root;

    protected class Node {
        Key key;
        Value val;
        Node left;
        Node right;
        // Tracker
        int N;
        // Red Black Tree
        boolean color;

        Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null)
            return 0;
        return x.N;
    }

    protected void recalculateSize(Node x) {
        x.N = size(x.left) + size(x.right) + 1;
    }

    // ===============================================
    // GET
    // ===============================================
    @Override
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);// Current Key vs node key
        if (cmp == 0)
            return x.val;
        else if (cmp < 0)
            return get(x.left, key);
        else
            return get(x.right, key);
    }

    // ===============================================
    // PUT
    // ===============================================
    @Override
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null)
            return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp == 0)
            x.val = value;
        else if (cmp < 0)
            x.left = put(x.left, key, value);
        else
            x.right = put(x.right, key, value);
        recalculateSize(x);
        return x;
    }

    // ===============================================
    // MAX
    // ===============================================
    @Override
    public Key max() {
        // TODO Auto-generated method stub
        return max(root).key;
    }

    private Node max(Node x) {
        if (x == null)
            return null;
        if (x.right == null)
            return x;
        return max(x.right);
    }

    // ===============================================
    // MIN
    // ===============================================
    @Override
    public Key min() {
        return min(root).key;
    }

    private Node min(Node x) {
        if (x == null)
            return null;
        if (x.left == null)
            return x;
        return min(x.left);
    }

    // ===============================================
    // Delete Min
    // ===============================================
    public void deleteMin() {
        root = deleteMin(root);
    }

    public Node deleteMin(Node x) {
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        recalculateSize(x);
        return x;
    }

    // ===============================================
    // Delete
    // ===============================================
    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node curNode, Key key) {
        if (curNode == null)
            return null;
        int cmp = key.compareTo(curNode.key);
        if (cmp < 0)
            curNode.left = delete(curNode.left, key);
        else if (cmp > 0)
            curNode.right = delete(curNode.right, key);
        else {
            // Found the node
            if (curNode.right == null)
                return curNode.left;
            if (curNode.left == null)
                return curNode.right;
            // Two Children on the node that we want to delete
            Node temp = curNode;
            curNode = min(temp.right);
            curNode.right = deleteMin(temp.right);
            curNode.left = temp.left;
        }
        recalculateSize(curNode);
        return curNode;
    }

    // ===============================================
    // Keys
    // ===============================================
    @Override
    public List<Key> keys(Key l, Key h) {
        return keys(root, l, h);
    }

    private List<Key> keys(Node x, Key l, Key h) {
        List<Key> list = new ArrayList<>();
        if (x == null)
            return list;
        int cmpL = l.compareTo(x.key);
        int cmpH = h.compareTo(x.key);
        if (cmpL < 0)
            list.addAll(keys(x.left, l, h));
        if (cmpL <= 0 && cmpH >= 0)
            list.add(x.key);
        if (cmpH > 0)
            list.addAll(keys(x.right, l, h));
        return list;
    }

}
