package com.company;

public class QueueUsingLL_20June {
    // Queue: - Data structure used for implementing FIFO approach.

    // front() :- start of the queue.
    Node front;
    // rear() :- end of the queue.
    Node rear;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    QueueUsingLL_20June() {
        this.front = null;
        this.rear = null;
    }

    public int getFront() {
        return front.data;
    }
    public int getRear() {
        return rear.data;
    }
    // 1. Enqueue: - Inserting the element from the end of the queue.
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // (i) If the queue is empty.
        if(front == null) {
            this.rear = this.front = newNode;
        }
        else {
            rear.next = newNode;
            rear = rear.next;
        }
    }

    // 2. Dequeue: - Removing the element from the start of the queue.
    public void dequeue() {
        if(front == null) {
            System.out.println("Queue is empty");
        }
        else if(front == rear) {
            front = rear = null;
        }
        else {
            front = front.next;
        }
    }

    // 3. Display: - Print the element from the start to end.
    public void display() {
        Node temp = front;
        while(temp != rear) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        QueueUsingLL_20June queue = new QueueUsingLL_20June();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);
        queue.display();
        queue.getFront();
        queue.getRear();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();

    }

}
