package javaInterview;

import java.util.Scanner;

public class PrimeChecker {
    /** Returns true if n is prime, false otherwise. */
    private static boolean isPrime(int n) {
        if (n <= 1) return false;                // 0,1 and negatives are not prime
        if (n <= 3) return true;                 // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check factors of the form 6k ± 1 up to √n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            /* ---------- Read n ---------- */
            System.out.print("Enter an integer to check for primality: ");
            int n = scanner.nextInt();

            /* ---------- Check & output ---------- */
            boolean prime = isPrime(n);
            System.out.println(n + (prime ? " is a prime number." : " is NOT a prime number."));
        }
    }
}
