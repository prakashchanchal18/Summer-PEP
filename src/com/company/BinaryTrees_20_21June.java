package com.company;


public class BinaryTrees_20_21June {
    // Tree Terminologies
    //  1. Node: - Representation of data in a tree.
    //  2. Root: - Topmost node of the tree.
    //  3. Parent: - A node which has either a left subtree or right subtree or both.
    //  4. Child: - A node which could be derived from a parent node.
    //  5. Leaf Node: - Any node which doesn't have either a left or right subtree.
    //  6. Height of the tree: - The number of edges from the root to the deepest leaf node.

/*
Types of Binary Tree
 1. Full Binary Tree: - A type of binary tree where a parent either has 0 children or 2 children.
 2. Complete Binary Tree: - A type of BT where the levels of the tree are completely filled except for the last level.
 3. Perfect Binary Tree: - A type of BT where all the nodes have strictly 2 children, except for the leaf node.
 4. Left Skewed Tree: - A type of BT where each node only contains left subtree.
 5. Right Skewed Tree: - A type of BT where each node only contains the right subtree.
 */


    // Any tree which contains the address for left-sub tree (left) and right sub-tree (right).
    /* NOTE: - Divide the data into 2 parts.
                 1. Left-Sub Tree
                 2. Right-Sub Tree
        NOTE: - Create a node which stores the address of the left and the right.
                 I.e., One node stores the address of 2 nodes, hence called Binary Tree. */
    Node root;
    // root is basically the start of the binary tree, and all the branches will be created from root.
    BinaryTrees_20_21June() {
        this.root = null;
    }
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int key) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        BinaryTrees_20_21June bTree = new BinaryTrees_20_21June();
        // insert a value to root
        if(bTree.root == null) {
            Node newNode = new Node(100);
            bTree.root = newNode;
        }
        else {
            bTree.root.left = new Node(50);
            bTree.root.right = new Node(200);
            bTree.root.left.left = new Node(10);
            bTree.root.left.right = new Node(300);
        }
    }
}
