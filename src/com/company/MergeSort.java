package com.company;

// Merge Sort :-
/*
    1. Practical approach
    2. Follow Divide and conquer technique -- Divide your problem into smaller problem until you find the solution.
    3. Comparison based sorting algorithm.
 */

import java.util.Scanner;

//        Algorithm :-
//        First divide the problem until you find a solution and then merge the solution so,
//        that we find the final solution of the problem statement.
public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = (mid - start) + 1;
        int n2 = end - start;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy the data from arr to L[] and R[]
        for(int i = 0; i < n1; i++) {
            L[i] = arr[start + i];
        }
        for(int i = 0; i < n2; i++) {
            R[i] = arr[mid+1 + i];
        }
    }
    public static void mergeSort(int[] arr, int start, int end) {
        // I have to find the mid-value, and array into two parts which is where left(0 to mid) and right(mid+1 to end)
        if(start <= end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1, end);
            merge(arr, start, mid, end);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // print the value before sorting
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // print the value after sorting
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
