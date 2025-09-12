/*
    10. Write a program to check if two strings are anagrams of each other.
    (An anagram means both strings contain the same characters with the same frequency, e.g., "listen" and "silent".)
*/

package QAInterviewQuestions;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                System.out.println("Not anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
        scanner.close();

    }
}

/*
# Example usage
print(are_anagrams("listen", "silent")) # True
print(are_anagrams("hello", "world")) # False
    Explanation:
    • Step 1: Check if lengths of both strings are equal. If not, they cannot be anagrams.
    • Step 2: Sort both strings and compare them.
    • Step 3: If sorted versions match, they are anagrams; otherwise, not.
 */