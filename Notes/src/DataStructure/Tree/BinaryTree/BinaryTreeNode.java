package DataStructure.Tree.BinaryTree;

public class BinaryTreeNode<T> {
    public T key;
    public BinaryTreeNode<T> leftChild, rightChild;

    public BinaryTreeNode(T k) {
        super();
        key = k;
    }
}