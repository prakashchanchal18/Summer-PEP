package com.company;

import java.util.Scanner;

// 1. Java is an Object-Oriented Programming Language.
// 2. Class name and file name can be different.
// 3. The name of .class file is dependent on the name of the class in .java file.
class Main {
    // 4. In the entire .java file, there should exist at least one class where main() is defined.
    // 5. Every .java file must have a main function so that the compiler knows from where the code starts.
    public static void main(String[] args) {
        // 6. How to display output in java.
        // 6.1 There are two methods to display output in java either print or println.
        // 6.2 print don't add a next line, whereas println adds an extra line to the output.
        System.out.println("Hello world!");
        System.out.print("Hello world!");

        // 7. How to take user custom input.
        // 7.1 There are two inbuilt class 1. Scanner or 2. Buffer Reader
        // 7.1.1 First import class like (import java.util.Scanner;) ()
        // 7.1.2 Create an object of the Scanner class.
        // Object syntax - Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        // 8. Packages --> It's basically a folder. --> Only contain collection of Java classes.
        //                  Ex: - java.util is a package that contains Scanner class.
        // 8.1 reverse the domain name. E.g. - google.com is domain name then name your package as com.google
        // 8.2 Declares package name on the top of java file.
        // 8.3 Here java.util is the package, which contains the classes like Scanner, Math, etc.

        // *Imp(Interview Question) -->
        // There exist a default package which automatically gets imported in a java file --> java.lang (java.language).
        // Every default keyword is available in java.lang package like System.out, all primitive data type .. etc.

        // (H/W) --> 1. Research work — How to take input as a char and as a String.
        //           2. Research work -- ASCII value.
        // https://github.com/arunkudiyal/lpu_summer_batch_01/tree/master

        // 9. There is only one method to take char and String input.

        // 9.1 Character input in java.
        // 9.2 We take a new String as an input but restrict it to single alphabet.
        char a = sc.next().charAt(0);
        System.out.println(a);

        // Character support ASCII Values.
        char ch = 71;
        System.out.println(ch);

        // 9.3 String input in java.
        // 9.4 String is Non-Primitive data type.
        // 9.5. It is a class that exists in java.lang.
        // 9.6. There are two ways to take String input
        String str1 = sc.next();
        String str2 = sc.nextLine();
        System.out.println(str1);
        System.out.println(str1+str2);
    }
}