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

    private BinarySearchTreeNode<T> findMinMethod(BinarySearchTreeNode<T> currentNode) {
        if (currentNode.leftChild != null) {
            return findMinMethod(currentNode.leftChild);
        }
        return currentNode;
    }

    private BinarySearchTreeNode<T> findMaxMethod(BinarySearchTreeNode<T> currentNode) {
        if (currentNode.rightChild != null) {
            return findMaxMethod(currentNode.rightChild);
        }
        return currentNode;
    }

    public BinarySearchTreeNode<T> findMin() {
        return findMinMethod(root);
    }

    public BinarySearchTreeNode<T> findMax() {
        return findMaxMethod(root);
    }

    private void printBinarySearchTreeMethod(BinarySearchTreeNode<T> currentNode) {
        if (currentNode != null) {
            System.out.println("Key is at " + currentNode.key + " value is " + currentNode.value);
            if (currentNode.leftChild != null) {
                printBinarySearchTreeMethod(currentNode.leftChild);
            }
            if (currentNode.rightChild != null) {
                printBinarySearchTreeMethod(currentNode.rightChild);
            }
        }
    }

    public void printBinarySearchTree() {
        printBinarySearchTreeMethod(root);
    }
}