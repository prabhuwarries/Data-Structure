package leetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public List<String> Solution(int n) {
        List <String> result = new ArrayList<>();
        backtrack( result , "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }

    }
    public static void main(String[] args) {
        generateParenthesis gp = new generateParenthesis();
        int n = 1;
        List<String> parentheses = gp.Solution(n);
        System.out.println("Generated Parentheses for n = " + n + ": " + parentheses);
    }
//         printList(list1);
//         System.out.println("List 2:");
//         printList(list2);




}

/*
import java.util*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack (result , "", 0, 0, n);
        return result;
    }

    private void backtrack (List<String> result, String current, int open, int close, int max ) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if( open < max) {
            backtrack(result, current + "(" , open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")" , open, close + 1, max);
        }
    }
}
 */