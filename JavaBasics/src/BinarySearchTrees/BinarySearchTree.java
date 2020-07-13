package BinarySearchTrees;

public class BinarySearchTree<T> {
    private BinarySearchTreeNode<T> root;

    public BinarySearchTree() {
        super();
    }

    private BinarySearchTreeNode<T> insertBinarySearchTreeNode(BinarySearchTreeNode<T> node, int key, T v) {
        if (node == null) {
            node = new BinarySearchTreeNode<T>(key, v);
            return node;
        }
        if (node.key < key) {
            node.rightChild = insertBinarySearchTreeNode(node.rightChild, key, v);
        } else {
            node.leftChild = insertBinarySearchTreeNode(node.leftChild, key, v);
        }

        return node;
    }

    public void insert(int k, T v) {
        root = insertBinarySearchTreeNode(root, k, v);
        System.out.println("Key: " + k + " Value: " + v + " is inserted");
    }

}