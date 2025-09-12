package javaInterview;

import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();
        System.out.println(n + " is " + (n % 2 == 0 ? "EVEN" : "ODD"));
        sc.close();
    }
}
