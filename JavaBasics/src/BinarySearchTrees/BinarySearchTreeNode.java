package BinarySearchTrees;

public class BinarySearchTreeNode<T> {
    int key;
    T value;
    BinarySearchTreeNode leftChild, rightChild;

    public BinarySearchTreeNode(int k, T v) {
        super();
        key = k;
        value = v;
    }
}