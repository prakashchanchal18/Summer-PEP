package com.company;// Can sum problem :-

import java.util.Scanner;

public class CanSumProblem {
    // Memorization
    public static long[] memo;
    public static boolean canSum(int[] arr, int target) {
        if(target == 0) {
            return true;
        }
        if(target < 0) return false;
        for(int i = 0; i < arr.length; i++) {
            int remainder= target - arr[i];
            return canSum(arr,remainder);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int targetSum = sc.nextInt();
        boolean result = canSum(arr, targetSum);
        System.out.println(result);
    }
}
