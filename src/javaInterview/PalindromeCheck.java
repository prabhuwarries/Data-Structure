package javaInterview;
import java.util.Scanner;

public class PalindromeCheck  {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Take input from user
            System.out.print("Enter a string to check for palindrome: ");
            String str = scanner.nextLine();

            // Normalize string to lowercase to handle case-insensitivity
            str = str.toLowerCase();

            boolean isPalindrome = true;

            // Check characters from both ends
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Output result
            System.out.println("\"" + str + "\" is palindrome: " + isPalindrome);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
