package com.company;
import java.util.Scanner;
public class LinearSearch {

    public static int linear_Search(int n, int[] arr, int element) {
        // Traverse the entire array
        for(int i = 0; i < n; i++) {
            // Check and compare each element with the element user want to search.
            if(arr[i] == element) {
                // If found return the index i
                return i;
            }
        }
        // If element not found return -1
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                  // Size of the array
        int[] arr = new int[n];                // Build the array
        for(int i = 0; i < n; i++)             // Input for array
            arr[i] = sc.nextInt();
        int element = sc.nextInt();            // Element user want to search
        int index = linear_Search(n, arr, element);
        System.out.println(index);
    }
}
