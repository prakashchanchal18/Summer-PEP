package com.company;

// Q :- Given a linked list, create a stack with following operations
//          1. push() --> Insert a element at top of stack.
//          2. pop() --> Remove an element from top of stack.
//          3. display() --> print the element of the stack.
//          4. peek() --> print the top element if the stack.
public class StackUsingLL_19June {

    static Node top;
    StackUsingLL_19June() {
        this.top = null;
    }
    public static  class Node {
        int data;
        Node next;
    }

    // push() operation --> Insert an element at the top of the stack.
    public void push(int element) {
        Node newNode = new Node();
        if(newNode == null) {
            System.out.println("Stack Overflow!"); // when the space is not available anymore and
            return;                               //        compiler doesn't allow you to create a node.
        }
        newNode.data = element;
        newNode.next = top;
        this.top = newNode;
        System.out.println(element + " has been updated.");
    }

    public void pop() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(top.data + " has been popped.");
        top = top.next;
    }

    public int peek() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return top.data;
    }
    public void display() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Q :- Given a linked list with head reference, find the middle of the linked list by printing the midData.

    public static void main(String[] args) {
        StackUsingLL_19June stack = new StackUsingLL_19June();
        stack.push(10);
        System.out.println("Top most element is " + stack.peek());
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        stack.display();
    }
}
