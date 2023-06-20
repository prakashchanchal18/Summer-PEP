package com.company;// In Binary Search we will be given the set of data in a standard approach, and it will be sorted (asc/ des).
// Data is sorted so that we will have an idea of which element lies where.

// For Binary Search break the array in two section, search the mid-point.
// mid-point == median of data ((starting index) + (last index))/2
// Compare the element from this middle element whether it lies in LA(Left Array) or RA(Right Array)
// Running time complexity for Binary Search is O(logN).
// Worst case in binary search is :-
//                  1. Element not found
//                  2. Element at first index.
// Note :- Last element can be also a worst case but it depends on number of element whether it's even or odd.

// If data is not sorted use Arrays.sort(arr);

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int n, int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        while(start <= end) {
            int midPoint = (start + end) / 2;
            if(arr[midPoint] == k) {
                return midPoint;
            }
            if(arr[midPoint] < k) {
                start = midPoint + 1;
            }
            else {
                end = midPoint - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int index = binarySearch(n, arr, k);
        System.out.print(index);
    }
}
