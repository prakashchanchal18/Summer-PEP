package com.company;

// 1. Array is a linear data structure --> It stores multiple values in one single variable.
// 2. Array uses indexing for accessing the values, indexing starts from 0.
// 3. Array stores multiple values in contiguous fashion.
// 4. Array only and only contain value of same datatype.

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // 1. Syntax(java) dataType[] variableName = {val1, val2, val3, ...};
        char[] myName1 = {'P', 'R', 'A', 'K', 'A', 'S', 'H'};

        // 2. Syntax(C) dataType variableName[] = {val1, val2, val3, ...}; This is also correct, but it will flash
        //              warning as C type array declaration.
        char myName2[] = {'P', 'R', 'A', 'K', 'A', 'S', 'H'};

        // Syntax(java) : dataType[] variableName = new dataType[size];
        char[] myName3 = new char[7];
        myName3[0] = 'P';
        myName3[1] = 'r';
        myName3[2] = 'a';
        myName3[3] = 'k';
        myName3[4] = 'a';
        myName3[5] = 's';
        myName3[6] = 'h';
        // myName3[7] = 'a';  Array index is out of bounds.

        // Scanner --> 2 delimiters --> enter, space
        // This means you can take input either in one line with a (space) or by changing line(enter).
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of array.
        int size = sc.nextInt();

        // Declare an array.
        int[] array = new int[size];

        // Take input in array.
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Size variations
        // char = 1 byte
        // byte = 2 bytes
        // short = 2 bytes
        // int = 4 bytes
        // float = 4 bytes
        // double = 8 bytes
        // long = 8 bytes
        // boolean = 1 byte1

        // Displaying the output;
        System.out.println(array);      // Reference variable --> Return address of the first element of the array.
        // array : 100, 200, 300, 400, 500
        //       : #10  #14  #18  #22  #26

        // Display the output
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // 2-D Array
        //   0   1   2   3   4   5  .  .  .
        // 0 100 200 300 400 500 600
        // 1
        // 2
        // 3
        // 4
        // 5
        // .
        // .
        // .

        // Taking no. of rows
        int rows = sc.nextInt();
        // Taking no. of column
        int column = sc.nextInt();
        // Declaring the 2D Array
        int[][] matrix = new int[rows][column];

        // Taking input in the AD Array
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the elements of the 2D Array
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < column; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        //Wrapper Class --> Class derivative for primitive datatype.
        // Integer newInt = new Integer(10);
    }
}
