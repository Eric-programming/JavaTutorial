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

    private BinarySearchTreeNode<T> findNodeMethod(int key, BinarySearchTreeNode<T> curTreeNode) {
        if (curTreeNode == null) {
            return null;
        }
        if (curTreeNode.key == key) {
            return curTreeNode;
        }
        if (curTreeNode.key > key) {
            return findNodeMethod(key, curTreeNode.leftChild);
        }
        return findNodeMethod(key, curTreeNode.rightChild);
    }

    public BinarySearchTreeNode<T> findNode(int key) {
        return findNodeMethod(key, root);
    }

    private BinarySearchTreeNode<T> rootWithDeletedNode(int key, BinarySearchTreeNode<T> currentNode) {
        if (currentNode == null) {
            return null;
        }
        // 1)Find the node
        if (currentNode.key > key) {
            currentNode.leftChild = rootWithDeletedNode(key, currentNode.leftChild);
        } else if (currentNode.key < key) {
            currentNode.rightChild = rootWithDeletedNode(key, currentNode.rightChild);
        } else if (currentNode.key == key) {
            // 2)Once we found it we detect if the root is only one child or no child
            if (currentNode.leftChild == null) {
                return currentNode.rightChild;
            } else if (currentNode.rightChild == null) {
                return currentNode.leftChild;
            } else {
                // 3)if root has two children
                BinarySearchTreeNode<T> tempNode = findMinMethod(currentNode.rightChild);
                currentNode.key = tempNode.key;
                currentNode.value = tempNode.value;// The rest stays the same (left child and right child)
                // 4) Delete the successor and we know that it is at the right child side
                currentNode.rightChild = rootWithDeletedNode(key, currentNode.rightChild);
            }
        }
        return currentNode;
    }

    // Delete Node(s)
    public void deleteNode(int key) {
        root = rootWithDeletedNode(key, root);
    }
}