package javaInterview;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] chars = sc.nextLine().toCharArray();
        int len = 0;
        for (char c : chars) len++;            // manual count
        System.out.println("Length = " + len);
        sc.close();
    }
}
