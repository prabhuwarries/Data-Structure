/*
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S is made only of the following characters: '(', '{', '[', ']', '}' and/or ')'.
 */

package CodilityTestSets;
public class Brackets {
    public int solution(String Stack) {

        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : Stack.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        System.out.println("Is the string \"" + S1 + "\" properly nested? " + (brackets.solution(S1) == 1 ? "Yes" : "No"));
        System.out.println("Is the string \"" + S2 + "\" properly nested? " + (brackets.solution(S2) == 1 ? "Yes" : "No"));
    }
}
