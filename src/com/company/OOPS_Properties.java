package com.company;

class Student {
    String name;
    int rollNo;
    int age;
    String batch;

    public Student(String name, int rollNo, int age, String batch) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.batch = batch;
    }

    // Getters and setters --> They give you access to read and write Data members, NOT DIRECTLY ..
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Hey, my name is " + this.name + " and I am " + this.age + " studying in " + this.batch + " batch with roll number " + this.rollNo + ".");
    }
    public void display(String name) {
        System.out.println("Hello... My name is " + name);
    }
    // public String display() ---> This is not polymorphism
    public void display(int age) {
        System.out.println("Hello... My age is " + age);
    }
}
public class OOPS_Properties {
    public static void main(String[] args) {
        Student studentOne = new Student("Vivek Kumar", 12018946,21, "PEP_2024" );
        // 1. Encapsulation :- A way of binding data members and member functions into a single unit called class.
        // 2. Abstraction :- Hiding the implementation details from the user which is of no use to the user.
        //                   So, we prevent this using access modifiers.
        //                   1. public 2. private 3. protected
        // 3. Polymorphism :- Poly(Many) + Morph(Forms) --> A function constructed in many forms.
        // Research work — Find the difference between runtime and compiler time polymorphism.
        // 4. Inheritance :- 1. Abstract classes  2. Interface
        studentOne.display();
//  studentOne.name = "Something else ....";
//  studentOne.display();
        System.out.println("The name of the student one is :- " + studentOne.getName());
        studentOne.setName("Raman Vera");
        studentOne.display();
        studentOne.display("Prakash Kumar");
        studentOne.display(21);
    }
}
