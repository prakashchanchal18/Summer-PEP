package com.company;

import java.util.Scanner;
public class June10_LinearSearch {

    public static int standard_linear_Search(int n, int[] arr, int element) {
        // Traverse the entire array.
        for(int i = 0; i < n; i++) {
            // Check and compare each element with the element user want to search.
            if(arr[i] == element) {
                // If found return the index i.
                return i;
            }
        }
        // If the element was not found, return -1.
        return -1;
    }
    public static void linear_Search(int n, int[] arr, int element) {
        // Traverse the entire array.
        for(int i = 0; i < n; i++) {
            // Check and compare each element with the element user want to search.
            if(arr[i] == element) {
                // print all the occurrence of the desired input.
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                  // Size of the array.
        int[] arr = new int[n];                // Build the array.
        for(int i = 0; i < n; i++)             // Input for an array.
            arr[i] = sc.nextInt();
        int element = sc.nextInt();            // Element user want to search.
        int index = standard_linear_Search(n, arr, element);
        System.out.println(index);
        linear_Search(n,arr,element);
    }
}
