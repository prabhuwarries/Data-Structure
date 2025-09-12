package javaInterview;

import java.util.Scanner;

/**
 * Calculates n! using a basic iterative loop.
 * Time  Complexity: O(n)  – single pass from 1 to n.
 * Space Complexity: O(1)  – a single accumulator variable.
 */
public class FactorialCalculator {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            /* ---------- Read n ---------- */
            System.out.print("Enter a non‑negative integer (n): ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }

            /* ---------- Compute n! iteratively ---------- */
            long factorial = 1;                 // use long; switch to BigInteger for very large n
            for (int i = 2; i <= n; i++) { // loop cost O(n)
                factorial *= i;
            }

            /* ---------- Output ---------- */
            System.out.println(n + "! = " + factorial);
        }
    }
}