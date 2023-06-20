package com.company;

import java.util.Scanner;

public class Fibonacci {

    // Creating a memo for storing value
    // Time complexity :- O(2n)
    // Order :- O(n);
    public static long[] memo;
    public static long fib(int term) {
        // Base condition.
        // Base condition :- Given values/Known Facts in the problem.
        // Base condition helps you to terminate the code.

        // Step 1. Write the base cases.
        if(term == 1) return 0;
        if(term == 2) return 1;

        // Step 2. Look for the values in the memo.
        if(memo[term] != 0) return memo[term];
        // Step 3. If the values is not calculated, calculate the value.
        long fibValue =  fib(term - 1) + fib(term - 2);
        // Step 4. The calculated value should be stored in fibValue.
        memo[term] = fibValue;
        // Step 5. Return the calculated value.
        return fibValue;
    }
    public static long fibonacci(int term) {
        memo = new long[term+2]; //
        for(int i = 0; i < term+1; i++)
            memo[i] = 0;
        return fib(term);
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        long value = fibonacci(term);
        System.out.println(value);

    }
}
