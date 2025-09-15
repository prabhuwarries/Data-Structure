/*
We are given two strings P and Q, each consisting of N lowercase English letters.
For each position in the strings, we have to choose one letter from either P or Q, in order to construct a new string S, such that the number of distinct letters in S is minimal.
Our task is to find the number of distinct letters in the resulting string S.

For example, if P = "ca" and Q = "ab", S can be equal to: "ca", "cb", "aa" or "ab".
String "aa" has only one distinct letter ('a'), so the answer is 1 (which is minimal among those strings).
Write a function:
class Solution { public int solution(String P, String Q); }
that, given two strings P and Q, both of length N, returns the minimum number of distinct letters of a string S, that can be constructed from P and Q as described above.
Examples:

1. Given P = "abc", Q = "bcd", your function should return 2.
All possible strings S that can be constructed are: "abc", "abd", "acc", "acd", "bbc", "bbd", "bcc", "bcd". The minimum number of distinct letters is 2, which be obtained by constructing the following strings: "acc", "bbc", "bbd", "bcc".

2. Given P = "axxz", Q = "yzwy", your function should return 2.
String S must consist of at least two distinct letters in this case. We can construct S = "yxxy", where the number of distinct letters is equal to 2, and this is the only optimal solution.

3. Given P = "bacad", Q = "abada", your function should return 1.
We can choose the letter 'a' in each position, so S can be equal to "aaaaa".

4. Given P = "amz", Q = "amz", your function should return 3.
The input strings are identical, so the only possible S that can be constructed is "amz", and its number of distinct letters is 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..200,000];
strings P and Q are both of length N;
strings P and Q are made only of lowercase letters (a−z);
strings P and Q contain a total of at most 20 distinct letters.
 */
package CodilityTestSets;

import java.util.HashSet;
import java.util.Set;

public class minDistinct {
    public int solution(String P, String Q) {
        int n = P.length();
        // 1️⃣ Check if answer = 1
        for (char candidate = 'a'; candidate <= 'z'; candidate++) {
            boolean possible = true;
            for (int i = 0; i < n; i++) {
                if (P.charAt(i) != candidate && Q.charAt(i) != candidate) {
                    possible = false;
                    break;
                }
            }
            if (possible) return 1;
        }

        // 2️⃣ Check if answer = 2
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            for (char c2 = (char) (c1 + 1); c2 <= 'z'; c2++) {
                boolean possible = true;
                for (int i = 0; i < n; i++) {
                    char p = P.charAt(i), q = Q.charAt(i);
                    if (!(p == c1 || p == c2 || q == c1 || q == c2)) {
                        possible = false;
                        break;
                    }
                }
                if (possible) return 2;
            }
        }

        // 3️⃣ Worst case → all distinct letters in P ∪ Q
        Set<Character> all = new HashSet<>();
        for (int i = 0; i < n; i++) {
            all.add(P.charAt(i));
            all.add(Q.charAt(i));
        }
        return all.size();
    }

    public static void main(String[] args) {
        minDistinct md = new minDistinct();
        String P = "abc";
        String Q = "bcd";
        int result = md.solution(P, Q);
        System.out.println("Minimum number of distinct letters: " + result);
        String P2 = "axxz";
        String Q2 = "yzwy";
        int result2 = md.solution(P2, Q2);
        System.out.println("Minimum number of distinct letters: " + result2);

        String P3 = "bacad";
        String Q3 = "abada";
        int result3 = md.solution(P3, Q3);
        System.out.println("Minimum number of distinct letters: " + result3);

        String P4 = "bacad";
        String Q4 = "abada";
        int result4 = md.solution(P4, Q4);
        System.out.println("Minimum number of distinct letters: " + result4);
    }
}
