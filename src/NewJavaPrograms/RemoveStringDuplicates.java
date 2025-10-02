/*
7. Remove Duplicates from a String: Return without Duplicates
Problem Description
Given a string s which may contain lowercase and uppercase characters,
remove all duplicate characters and return the resultant string with unique characters (order may or may not be preserved,
but typically preserve order).
 */
package NewJavaPrograms;
import java.util.LinkedHashSet;

public class RemoveStringDuplicates {
    public String removeDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RemoveStringDuplicates solution = new RemoveStringDuplicates();
        String s = "geeksforgeeks";
        System.out.println(solution.removeDuplicates(s));  // Output: "geksfor"
    }
}
