/*
Find the Index of the First Occurrence in a String
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
 */
package leetCodeQuestions;
public class firstOccurrence {
    public int Solution(String haystack, String needle) {
        if (needle.isEmpty() || haystack.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        firstOccurrence fo = new firstOccurrence();
        String haystack = "leetcode";
        String needle = "leeto";
        int index = fo.Solution( haystack, needle);
        System.out.print( " Index of First Occurrence: " + index);
    }
}
