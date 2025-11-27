package StringManipulation;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("After Removing Duplicates: " + removeDuplicates(input));
        // Output: progamin
    }
}