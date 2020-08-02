package DataStructure.Tree.BinarySearchTrees;

public class BinarySearchTreeNode<T> {
    int key;
    T value;
    BinarySearchTreeNode<T> leftChild, rightChild;

    public BinarySearchTreeNode(int k, T v) {
        super();
        key = k;
        value = v;
    }
}