package com.company;
// Linear Search is applied where we don't know which element is placed where.
// In Binary Search, we will be given the set of data in a standard approach, and it will be sorted (asc/des).
// NOTE:- In binary search data is sorted.
// Data is sorted so that we will have an idea of which element lies where.

// For Binary Search break the array in two sections, search the mid-point.
// mid-point == median of data ((starting index) + (last index))/2
// Compare the element from this middle element whether it lies in LA (Left Array) or RA (Right Array)

// Running time complexity for Linear Search is -- O (N).
// The worst case in linear search is: -
//                  1. Element didn't find
//                  2. Element at last index.

// Running time complexity for Binary Search is -- O (logN).
// The worst case in binary search is: -
//                  1. Element didn't find
//                  2. Element at first index.
// Note: - Last element can be also the worst case, but it depends on the number of elements whether it's even or odd.

// If data is not sorted use Arrays.sort(arr);

// Running time complexity comparison -- O(log n) < O(n) < O(n log n)

import java.util.Arrays;
import java.util.Scanner;
public class June12_BinarySearch {

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
