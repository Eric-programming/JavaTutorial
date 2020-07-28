package DataStructure.Tree.BinarySearchTrees;

public class BinarySearchTreeApp {
    public static void main(String[] args) {
        long[] items = new long[] { 8, 7, 6, 5, 4, 3, 2, 1 };
        BinarySearchTree<Long> tree = new BinarySearchTree<>();
        for (int i = 0; i < items.length; i++) {
            tree.insert(i, items[i]);
        }
        tree.printBinarySearchTree();
        System.out.println("Max key is " + tree.findMax().key + " and Max Value is " + tree.findMax().value);
        System.out.println("Min key is " + tree.findMin().key + " and Min Value is " + tree.findMin().value);

        System.out.println("Index 10 is " + tree.findNode(10));
        System.out.println("Index 5 is " + tree.findNode(5).value);

        tree.deleteNode(1);
        tree.deleteNode(10);
        tree.deleteNode(3);

        tree.printBinarySearchTree();

    }
}