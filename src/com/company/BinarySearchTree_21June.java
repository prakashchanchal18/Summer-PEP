package com.company;

import org.w3c.dom.ls.LSOutput;

public class BinarySearchTree_21June {
    // Binary Search Tree
    // NOTE: - BST doesn't support duplicate element.
    // Data:- 23, 12, 9, 5, 99, 55, 53, 1, 98, 100

    // Insertion:-
    //  1. Read the random data.
    //  2. Take a first element and mark it as the root of the tree.
    //  3. Read the remaining data, all the data lesser than the root/parent will be placed to the left else to the right.

    Node root;
    BinarySearchTree_21June() {
        this.root = null;
    }
    private static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Encapsulated Function
    // Whenever you call
    public void insert(int data) {
        root = insertData(root, data);
    }
    public void inOrder() {
        inOrderTraversal(root);
        System.out.println();
    }
    public void preOrder() {
        preOrderTraversal(root);
        System.out.println();
    }
    public void postOrder() {
        postOrderTraversal(root);
        System.out.println();
    }
    private Node insertData(Node root, int data) {
        // 1. Tree is not available.
        if(root == null) {
            root = new Node(data);
        }
        // 2. If tree is available.
        else if(root.data > data) {
            root.left = insertData(root.left, data);
        }
        else if(root.data < data) {
            root.right = insertData(root.right, data);
        }
        return root;
    }

    // Trees Order
    //  1. Inorder:- (LDR) -- 1, 5, 9, 12, 23, 53, 55, 98, 99, 100
    // NOTE:- In order of any BST is always in the ascending order.
    private void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);        // L
            System.out.print(root.data + " ");  // D
            inOrderTraversal(root.right);       // R
        }
    }
    //  2. PreOrder:- (DLR) -- 23, 12, 9, 5, 1, 20, 99, 55, 53, 98, 100
    // NOTE:- First output of preorder prints the root.
    private void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");  // D
            preOrderTraversal(root.left);       // L
            inOrderTraversal(root.right);       // R
        }
    }
    //  3. PostOrder:- (LRD) -- 1, 5, 9, 12, 53, 98, 55, 100, 99, 23
    // NOTE:- Last output of postorder prints the root.
    private void postOrderTraversal(Node root) {
        if(root != null) {
            postOrderTraversal(root.left);          // L
            postOrderTraversal(root.right);         // R
            System.out.print(root.data + " ");      // D
        }
    }
    public static void main(String[] args) {
        BinarySearchTree_21June bst = new BinarySearchTree_21June();
        bst.insert(23);
        bst.insert(12);
        bst.insert(9);
        bst.insert(5);
        bst.insert(99);
        bst.insert(55);
        bst.insert(53);
        bst.insert(1);
        bst.insert(98);
        bst.insert(100);
        bst.inOrder();
        bst.preOrder();
        bst.postOrder();
    }
}
