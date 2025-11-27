/*
 * Regular Expression Matching in Java
 * Implement regular expression matching with support for ’.’ and ’*’.
 * ’.’ Matches any single character. ’*’ Matches zero or more of the preceding
 * element.
 * The matching should cover the entire input string (not partial).
 * The function prototype should be: bool isMatch(const char *s, const char *p)
 * Some examples: isMatch("aa","a") return false isMatch("aa","aa") return true
 * isMatch("aaa","aa")
 * return false isMatch("aa", "a*") return true isMatch("aa", ".*") return true
 * isMatch("ab",
 * ".*") return true isMatch("aab", "c*a*b") return true
 */

package CodingInterview;

public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        // Base Case: if pattern is empty, string must also be empty
        if (p.length() == 0) {
            return s.length() == 0;
        }

        // Check if first characters match (considering '.')
        boolean firstMatch = (s.length() > 0 &&
                (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        // If pattern has at least 2 characters and second char is '*'
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Two possibilities:
            // 1. '*' counts as zero occurrences of previous char (skip "x*")
            // 2. '*' counts as one or more occurrences (if first char matches)
            return (isMatch(s, p.substring(2)) ||
                    (firstMatch && isMatch(s.substring(1), p)));
        } else {
            // Otherwise, move both string and pattern ahead by one
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        RegularExpressionMatching obj = new RegularExpressionMatching();
        System.out.println(obj.isMatch("aa", "a")); // false
        System.out.println(obj.isMatch("aa", "a*")); // true
        System.out.println(obj.isMatch("ab", ".*")); // true
        System.out.println(obj.isMatch("aab", "c*a*b")); // true
        System.out.println(obj.isMatch("mississippi", "mis*is*p*.")); // false
    }
}