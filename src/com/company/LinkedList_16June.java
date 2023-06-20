package com.company;/* Data Structure :-
  1. Linear Data Structure :- Array, Stack, Queue, LinkedList ....
  2. Non-Linear Data Structure :- Tree, Heaps, Graphs ....
 */

/* Linked List :-
    1. It is a linear data structure, where we create nodes.
    2. Every node have 2 parts (i. Data, ii. Address of next data).
    3. Every linked list start with a reference called head.
    4. Linked list is non-contiguous data structure.
 */

public class LinkedList_16June {

    /*  class ----- > main
        LinkedList ---- > classes created inside this class will be static i.e. it will not change.
        So that we can use it in main method.
        If we create a class outside a class we don't have to make it static.
     */
    // CRUD operation on linked list.
    // CRUD :- Create Read Update Delete

    static Node head;
    static class Node {
        // 1. Data related to the node.
        int data;
        // 2. memory reference of the next node
        Node next;
        // 3. constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Constructor of the class linked list.
    LinkedList_16June() {
        this.head = null;
    }
    // Insertion :- 1. Linked List is empty
    //              2. Linked list contain some data.
    // A utility method to insert the data at the end of the linked list.
    public void insertAtEnd(int data) {
        // Create a node for insertion.
        Node newNode = new Node(data);
        if(head == null) { // Linked List is empty
            head = newNode;
        }
        else { // Linked list is not empty
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public void insertAfter(int data1, int data2) {
        // 1. data1 does not exist
        Node temp = head;
        while(temp.data != data1) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("Data1 doesn't exist");
                break;
            }
        }
        // data1 exist
        if(temp != null) {
            Node newNode = new Node(data2);
            Node temp2 = temp.next;
            temp.next = newNode;
            newNode.next = temp2;
        }
    }

    public void insertAtBeg(int data) {
        // Create a node for insertion.
        Node newNode = new Node(data);
        if(head == null) { // Linked List is empty
            head = newNode;
        }
        else {
            Node temp3 = head;
            head = newNode;
            newNode.next = temp3;
        }
    }

    public void deleteFromEnd() {
        if(head == null) {
            System.out.println("Linked List is empty");
        }
        else {
            Node temp = head;
            while(temp.next.next != null) {
                 temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void deleteFromStart()  {
        if(head == null) {
            System.out.println("Linked List is empty");
        }
        else {
            head = head.next;
        }
    }
    // A utility method to delete the element after the given data
    public void deleteElement(int data) {
        Node slow = head;
        Node temp = head;
        Node fast = head.next;
        while(temp.data != data) {
            slow = temp;
            temp = fast;
            fast = fast.next;
            if (temp == null) {
                System.out.println("Data doesn't exist");
                break;
            }
        }
        slow.next = fast;
    }
    public void findMid() {
        int count = 0;
        Node temp = head;
        Node temp_mid = head;
        if(head == null) {
            System.out.println("Linked list is empty.");
        }
        else {
            while(temp != null) {
                temp = temp.next;
                count++;
            }
            int n = (count)/2;
            while(n-- > 0) {
                temp_mid = temp_mid.next;
            }
            System.out.println(temp_mid.data);
        }
        //System.out.println(count);
    }
    // A utility method to display the element of the linked list.
    public void display() {
        if(head == null) {
            System.out.print("Linked list is empty");
        }
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    /* Important interview question :-
    Given a linked list create a function print reverse to reverse or to print the linked list in the reverse order
    without actually reversing the linked list.
    Constraint :- You are not allowed to use any other data structure like array.
    This should be in place.
     */
    public void displayReverse(Node head) {
        if(head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }
    public static void main(String[] args) {
        LinkedList_16June list = new LinkedList_16June();
        list.display();
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        list.insertAtEnd(400);
        list.insertAtEnd(500);
        list.display();
        list.insertAfter(200, 50);
        list.display();
        list.insertAfter(2000, 50);
        list.display();
        list.insertAtBeg(12);
        list.insertAtBeg(13);
        list.insertAtBeg(14);
        list.insertAtBeg(17);
        list.display();
        list.deleteFromEnd();
        list.display();
        list.deleteFromStart();
        list.display();
        list.deleteElement(50);
        list.display();
        list.findMid();
        list.displayReverse(head);
    }
}
