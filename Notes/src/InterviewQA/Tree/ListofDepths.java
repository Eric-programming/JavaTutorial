package InterviewQA.Tree;

import java.util.*;

import DataStructure.Tree.BinaryTree.BinaryTreeNode;

/**
 * List of Depths: Given a Binary tree create Linked Lists of all the nodes at
 * each depth , say if the tree has height k then create k linked lists.
 * 
 * Input: A binary tree (root node)
 * 
 * Output: K linked lists if the height of tree is k. Each linked list will have
 * all the nodes of each level.
 * 
 * Parent root: 1 and Child root: 2, 3
 * 
 * List1=> 1
 * 
 * List2=> 2,3
 */
public class ListofDepths {

    public static void main(String[] args) {
        // Test 1
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        root.leftChild = new BinaryTreeNode<Integer>(2);
        root.rightChild = new BinaryTreeNode<Integer>(3);

        System.out.println(ListOfDepthsMethod(root));
        // Test 2
        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<Integer>(1);
        root2.leftChild = new BinaryTreeNode<Integer>(2);
        root2.rightChild = new BinaryTreeNode<Integer>(3);
        root2.leftChild.leftChild = new BinaryTreeNode<Integer>(4);
        root2.leftChild.rightChild = new BinaryTreeNode<Integer>(5);
        root2.rightChild.leftChild = new BinaryTreeNode<Integer>(6);

        System.out.println(ListOfDepthsMethod(root2));

    }

    public static ArrayList<LinkedList<Integer>> ListOfDepthsMethod(BinaryTreeNode<Integer> root) {
        /**
         * BT => Queue BFS
         */
        Queue<Integer> storage = new LinkedList<>();
        Queue<BinaryTreeNode<Integer>> tempStorage = new LinkedList<>();
        storage.add(root.key);
        tempStorage.add(root);

        while (tempStorage.isEmpty() == false) {
            BinaryTreeNode<Integer> tempNode = tempStorage.poll();

            if (tempNode.leftChild != null) {
                storage.add(tempNode.leftChild.key);
                tempStorage.add(tempNode.leftChild);
            }
            if (tempNode.rightChild != null) {
                storage.add(tempNode.rightChild.key);
                tempStorage.add(tempNode.rightChild);
            }
        }
        /**
         * Store each level into a linkedlist and for each linkedlist, we are going to
         * store it inside the arraylist
         */
        ArrayList<LinkedList<Integer>> list = new ArrayList<>();
        int max = 1;
        while (storage.isEmpty() == false) {
            LinkedList<Integer> tempList = new LinkedList<>();
            for (int i = 0; i < max; i++) {
                if (storage.isEmpty()) {
                    break;
                }
                tempList.add(storage.poll());
            }
            max *= 2;
            list.add(tempList);
        }
        return list;
    }
}