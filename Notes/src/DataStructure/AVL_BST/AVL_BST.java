package DataStructure.AVL_BST;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}

class AVL_BST {

    Node root;

    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    void insert(int key) {
        this.root = insert(this.root, key);
    }

    private Node insert(Node node, int key) {

        /* 1. Perform the normal BST insertion */
        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;

        /* 2. Update height of this ancestor node */
        node.height = 1 + Math.max(height(node.left), height(node.right));

        /*
         * 3. Get the balance factor
         */
        int balance = getBalance(node);
        boolean isLeftHeavy = balance > 1;
        boolean isRightHeavy = balance < -1;

        // are 4 cases Left Left Case
        if (isLeftHeavy && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (isRightHeavy && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (isLeftHeavy && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (isRightHeavy && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void preOrder(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (q.isEmpty() == false) {
            Node top = q.remove();
            System.out.println(top.key);
            if (top.left != null) {
                q.add(top.left);
            }
            if (top.right != null) {
                q.add(top.right);
            }
        }
    }

    public static void main(String[] args) {
        AVL_BST tree = new AVL_BST();

        /* Constructing tree given in the above figure */
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Preorder traversal" + " of constructed tree is : ");
        tree.preOrder(tree.root);
    }
}
