package javaInterview;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non‑negative integer: ");
        long n = sc.nextLong();                 // accepts large ints
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n   /= 10;
        }
        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}