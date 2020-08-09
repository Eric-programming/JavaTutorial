package DataStructure.Tree.BinarySearchTrees;

/**
 * Binary Search Tree is a binary tree that each nodes has a left child that is
 * less than or equal to current node. And right child must be greater than the
 * current node
 */
public class BinarySearchTreeApp {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        // Insertion
        tree.insert(8, 100);
        tree.insert(4, 101);
        tree.insert(10, 102);
        tree.insert(2, 103);
        tree.insert(20, 104);
        tree.insert(6, 105);

        // Print
        tree.printBinarySearchTree();

        // Max
        System.out.println("Max key is " + tree.findMax().key + " and Max Value is " + tree.findMax().value);
        // Min
        System.out.println("Min key is " + tree.findMin().key + " and Min Value is " + tree.findMin().value);

        // Find Nodes
        System.out.println("Index 10 is " + tree.findNode(10) != null ? tree.findNode(10).value : null);
        System.out.println("Index 4 is " + tree.findNode(4) == null ? null : tree.findNode(4).value);

        // Delete Node
        tree.deleteNode(1);
        tree.deleteNode(10);
        tree.deleteNode(4);

        // Print
        tree.printBinarySearchTree();

    }
}