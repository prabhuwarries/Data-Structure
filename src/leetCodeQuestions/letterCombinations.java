/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below.
Note that 1 does not map to any letters.
 */
package leetCodeQuestions;
import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    private static final String [] KEYPAD = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
    }
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }
    private void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        letterCombinations solution = new letterCombinations();
        String digits = "23";
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println("Letter combinations for digits " + digits + ": " + combinations);
        String digits2 = "";
        List<String> combinations2 = solution.letterCombinations(digits2);
        System.out.println("Letter combinations for digits " + digits2 + ": " + combinations2);
        String digits3 = "2";
        List<String> combinations3 = solution.letterCombinations(digits3);
        System.out.println("Letter combinations for digits " + digits3 + ": " + combinations3);
    }
}
