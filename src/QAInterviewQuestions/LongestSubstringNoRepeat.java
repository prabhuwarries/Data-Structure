/*
    5. Find the length of the longest substring without repeating characters.
 */

package QAInterviewQuestions;
import java.util.*;
public class LongestSubstringNoRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Longest substring length: " + maxLen);
        sc.close();
    }
}

/*
# Example
print(longest_unique_substring("abcabqbcabcabd")) # Output: 4 (substring "abcd")
print(longest_unique_substring("bbbbb")) # Output: 1 (substring "b")
print(longest_unique_substring("pwwkew")) # Output: 3 (substring "wke")
    Explanation:
    • last_index remembers the most recent index of each character.
    • start is the left pointer of the current window (beginning of the substring without repeats).
    • When a character repeats and its last seen index is inside the window (>= start), move start
    to last_index[ch] + 1 to exclude the earlier occurrence.
    • Update last_index[ch] = i and compute the current window length i - start + 1. Keep the
    maximum.
    • Complexity: O(n) time, O(min(n, Σ)) space where Σ is character alphabet size.
 */