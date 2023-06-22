package com.company;
import java.util.Scanner;

public class June10_ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // I didn't pass any default values.
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // depending on n default value "0" will be printed n times.
    }
}
