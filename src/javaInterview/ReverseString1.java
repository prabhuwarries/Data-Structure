/*
Write a Java program to reverse a string without using reverse().
We can reverse a string by iterating from the end to the beginning and
appending characters to a new string or using a StringBuilder (but without calling its reverse() method).
Here's a simple program using a loop:
 */
package javaInterview;
public class ReverseString1 {
    public static void main (String[] args) {
        String original = "Hello, World!";
//        String reversed = "";

        // Iterate from the end of the string to the beginning
//        for (int i = original.length() - 1; i >= 0; i--) {
//            reversed += original.charAt(i); // Append each character to the new string
//        }
        // Using StringBuilder for better performance
        StringBuilder sb = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            sb.append(original.charAt(i));
        }
        String reversed = sb.toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

}
