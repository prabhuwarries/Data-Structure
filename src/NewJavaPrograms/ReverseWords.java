/*
8. Print the Words of a String in Reverse
Problem Description
Given a string, print the words in reverse order (reverse the sequence of words, not the words themselves).
For example, "hello world" becomes "world hello
 */
package NewJavaPrograms;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");  // Split by one or more spaces
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();
        String s = "hello world";
        System.out.println(solution.reverseWords(s));  // Output: "world hello"
    }
}
