package javaInterview;

import java.util.Scanner;

/**
 * Prints the first n numbers of the Fibonacci sequence.
 * Time Complexity : O(n)  – single loop of n iterations.
 * Space Complexity: O(1)  – we keep only two variables for the last two terms.
 */

public class FibonacciSeries {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            /* ---------- Read n ---------- */
            System.out.print("Enter how many Fibonacci numbers to display (n ≥ 1): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            /* ---------- Generate & display ---------- */

            long a = 1, b = 1;        // first two terms

            System.out.print("Fibonacci Series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? " " : ""));
                long next = a + b;    // compute next term
                a = b;                // shift
                b = next;
            }
            System.out.println();     // newline
        }
    }
}