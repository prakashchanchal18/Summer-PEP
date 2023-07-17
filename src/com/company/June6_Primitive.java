package com.company;

import java.util.Scanner;

public class June6_Primitive {
    // JDK - Java Development Kit
    // JRE - Java Runtime Environment
    // JVM - Java Virtual Machine

    // JVM -- Contains a java compiler known as "javac"
    // .java --> javac --> .class

    // c/c++ compiler convert .c/.cpp file into .exe file.
    // In c/c++ we use the concept of "Pointer" which makes it platform dependent.
    // Pointers - Pointers give direct access to physical memory.
    // *prt - It is used to access memory.
    // &ptr - It is used to access address.

    // In java, you cannot create a pointer i.e., in java you cannot directly access any memory location.
    // Java is a platform independent language.
    // JVM is responsible for java to be a platform independent programming language.

    // How to compile java using terminal
    // step 1: javac FileName.java
    // step 2: java FileName
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        Data Type	Default Value (for fields)
          byte	0
          short	0
          int	0
          long	0L
          float	0.0f
          double	0.0d
          char	'\u0000'
          String (or any object)	null
          boolean	false
 */

        // Q: What is radix?
        // A: Radix is the parameter that specifies the number system to be used.
        //    For example, binary = 2, octal = 8, hexadecimal = 16, etc.

        // 1. Byte: -128 to 127
        byte b = sc.nextByte();
        System.out.println(b);

        // 2. short :  -32,768 to 32,767
        short s = sc.nextShort();
        System.out.println(s);

        // 3. int : -2^31 to  2^31 - 1
        int i = sc.nextInt();
        System.out.println(i);

        // 4. long : -2^63 to 2^63 - 1
        long l = sc.nextLong();
        System.out.println(l);

        // 5. float : 6 decimal digits
        float f = sc.nextFloat();
        System.out.println(f);

        // 6. double : 15 decimal digits
        double d = sc.nextDouble();
        System.out.println(d);

        // 7. boolean: true and false
        boolean b0 = sc.nextBoolean();
        System.out.println(b0);

        // 8. char : '\u0000' (or 0) to '\uffff' (or 65,535)
        char c = sc.next().charAt(0);
        System.out.println(c);


        // Non-Primitive Data Type
        // String: Array pull of character.
        String str = sc.next();
        System.out.println(str);
    }
}
