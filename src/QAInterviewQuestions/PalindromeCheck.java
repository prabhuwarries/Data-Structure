/*
    3. Check if a string is a palindrome. To solve this, use two pointers: one starting at the left end, the other at the right end,
    and compare characters until they meet.
    Example: Below:
 */
package QAInterviewQuestions;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Is Palindrome? " + isPalindrome);
        sc.close();
    }
}

/*
# Example
print(is_palindrome("madam")) # Output: True
print(is_palindrome("hello")) # Output: False
    Explanation:
    • A palindrome reads the same forward and backward.
    • Use two pointers: compare characters at the beginning and end.
    • If all pairs match, it’s a palindrome; otherwise, it’s not.
    • Complexity: O(n) time, O(1) space.
 */