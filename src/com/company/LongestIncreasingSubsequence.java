package com.company;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static int longestIS(int[] arr, int n) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i+1] > arr[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        longestIS(arr, n);
    }
}
