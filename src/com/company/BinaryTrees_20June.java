package com.company;


public class BinaryTrees_20June {
    // Any tree which contains the address for left-sub tree (left) and right sub-tree (right).
    /* NOTE: - Divide the data into 2 parts.
                 1. Left-Sub Tree
                 2. Right-Sub Tree
        NOTE: - Create a node which stores the address of the left and the right.
                 I.e., One node stores the address of 2 nodes, hence called Binary Tree. */
    Node root;
    // root is basically the start of the binary tree, and all the branches will be created from root.
    BinaryTrees_20June() {
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
        BinaryTrees_20June bTree = new BinaryTrees_20June();
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
