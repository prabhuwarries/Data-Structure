package javaInterview;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Ask for input
            System.out.print("Enter a string to reverse: ");
            String original = scanner.nextLine();

            // Using StringBuilder to reverse the string
            String reversed = new StringBuilder(original).reverse().toString();
            System.out.println("Reversed: " + reversed);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
