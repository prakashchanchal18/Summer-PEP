package com.company;

// Interface :-
interface Employee {
    // Data member: - Are always going to be static
    int emp_id = 129232;
    String name = "Sumit";
    String dept = "IT";
    String bGroup = "A+";

    // Constructors :- Creating constructor in  interfaces is not allowed bcz the data is already initialized.
    // Employee() {  }

    // Member Function: - You can have member function in interface, BUT THEY SHOULD NOT CONTAIN BODY.
    public void display();
}

interface RBI {
    int roi = 5;
    public void display(int roi);
}
public class June10_Interface {
    public static void main(String[] args) {
        //  System.out.println();
    }
}
