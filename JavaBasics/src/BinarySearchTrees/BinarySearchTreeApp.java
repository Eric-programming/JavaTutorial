package BinarySearchTrees;

public class BinarySearchTreeApp {
    public static void main(String[] args) {
        long[] items = new long[] { 8, 7, 6, 5, 4, 3, 2, 1 };
        BinarySearchTree<Long> tree = new BinarySearchTree<>();
        for (int i = 0; i < items.length; i++) {
            tree.insert(i, items[i]);
        }

    }
}