package com.company;

// OOP --> Deals with classes and objects.
// Class :- A template, which helps you create real life entity.
//          Class contain two things --> 1. Data Members(Properties) 2. Member Functions(Methods)
// Objects :- The real-life entity created from the class is called object.

class Animal {
    // 1. Data Members :- Primitive or Non-Primitive data used for a building object.
    String name;
    int no_of_legs;
    boolean isCarnivorous;
    boolean canPet;
    String color;

    // Member functions: - Functions or Methods which help you create a default function available for
    //                     all object created from the objects.
    // Syntax :-
    public void display() {
        System.out.println("Hey, My name is " + name + ". My color is " + color + ".");
    }

    // Constructors :- Used to initialize the values of the data members when you are creating an object.
    // 2 types :- 1. Default / Non-Parametrized (automatically created by the compiler) 2. Parameterized
    // NOTE :- If you are using a parameterized constructor only,
    //         then you cannot use default constructor until you define it.

    Animal(int no_of_legs, boolean isCarnivorous, String name, boolean canPet, String color) {
        // this.propertyName = parameterName;
        this.name = name;
        this.no_of_legs = no_of_legs;
        this.isCarnivorous = isCarnivorous;
        this.canPet = canPet;
        this.color = color;
    }
}

public class June9_ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Object :- Real life entity.
        // Syntax :- ClassName objectName = new Constructor();
        // Constructor has same name as class name.
        Animal dog = new Animal(4, true, "Jack", true, "black");
/*
        dog.display();  Default values :- int - 0, String - null, float/double - 0.0, boolean - false.
        dog.name = "Jack";
        dog.no_of_legs = 4;
        dog.isCarnivorous = true;
        dog.canPet = true;
        dog.color = "black";
*/

        System.out.println("Hey, My name is " + dog.name + ". My color is " + dog.color + ".");
        dog.display();
    }
}
