package com.rays.basic.program;
public class FibonacciSeriesProgram {
    public static void main(String[] args) {
        int n = 10; // Number of elements in the Fibonacci series
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series of " + n + " numbers: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");
            
            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
