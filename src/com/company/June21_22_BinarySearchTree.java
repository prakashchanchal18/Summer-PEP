package com.company;

public class June21_22_BinarySearchTree {
    // Binary Search Tree
    // Running time complexity of insertion and searching is -- O(log N base 2)

    // NOTE: - BST doesn't support duplicate element.
    // Data:- 23, 12, 9, 5, 99, 55, 53, 1, 98, 100

    // Insertion:-
    //  1. Read the random data.
    //  2. Take a first element and mark it as the root of the tree.
    //  3. Read the remaining data, all the data lesser than the root/parent will be placed to the left else to the right.

    Node root;
    June21_22_BinarySearchTree() {
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
    public boolean search(int key) {
        Node address = searchKey(root, key);
        if(address == null) {
            return false;
        }
        else {
            return true;
        }
    }
    // Insertion in BST
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

    //Searching in BST
    // Data should be random order, if data is in any order, then that tree will be skewed tree.
    // In BST searching becomes easy
    // NOTE: - Search key return address of the node when the data is found and return null when the data is not found.
    private Node searchKey(Node root, int key) {
        if(root == null || key == root.data) {
            return root;
        }
        else if(key < root.data) {
            return searchKey(root.left, key);
        }
        else if(key > root.data){
            return searchKey(root.right, key);
        }
        return root;
    }

    // Deletion in BST
    // case 1: Delete a Leaf Node.
    // Case 2: Delete a node with one child.
    // Case 3:

    // Trees Order
    //  1. Inorder:- (LDR) -- 1, 5, 9, 12, 23, 53, 55, 98, 99, 100
    //  NOTE:- In order of any BST is always in the ascending order.
    private void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);        // L
            System.out.print(root.data + " ");  // D
            inOrderTraversal(root.right);       // R
        }
    }
    //  2. PreOrder:- (DLR) -- 23, 12, 9, 5, 1, 20, 99, 55, 53, 98, 100
    //  NOTE:- First output of preorder prints the root.
    private void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");  // D
            preOrderTraversal(root.left);       // L
            inOrderTraversal(root.right);       // R
        }
    }
    //  3. PostOrder:- (LRD) -- 1, 5, 9, 12, 53, 98, 55, 100, 99, 23
    //  NOTE:- Last output of postorder prints the root.
    private void postOrderTraversal(Node root) {
        if(root != null) {
            postOrderTraversal(root.left);          // L
            postOrderTraversal(root.right);         // R
            System.out.print(root.data + " ");      // D
        }
    }
    public static void main(String[] args) {
        June21_22_BinarySearchTree bst = new June21_22_BinarySearchTree();
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
        System.out.println(bst.search(100));
        System.out.print(bst.search(777));
    }
}

// Questions based on order of BST.

// Q: - Given a preorder traversal for a BST, find the inorder and postorder. (POSSIBLE)
// A: - Create a tree based on the given preorder and then follow LDR to find in order and LRD for postorder.

// Q:- Given a post-order traversal for a BST, find inorder and preorder. (POSSIBLE)
// A: - Create a tree based on the given postorder and then follow LDR to find in order and DLR for preorder.

// Q: - (Imp***) -- Given an inorder traversal for a BST, find preorder and postorder. (NOT POSSIBLE)
// A:- This problem is not possible because the value of root is not defined.