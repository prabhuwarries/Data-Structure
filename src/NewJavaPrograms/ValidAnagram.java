/*
6. Two String Anagram
Problem Description
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */
package NewJavaPrograms;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];  // Assuming lowercase letters
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solution.isAnagram(s, t));  // Output: true
        t = "rat";
        System.out.println(solution.isAnagram(s, t));  // Output: false
    }
}
