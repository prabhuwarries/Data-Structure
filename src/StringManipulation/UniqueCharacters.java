package StringManipulation;

import java.util.HashSet;

public class UniqueCharacters {
    public static boolean hasAllUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAllUnique("abcdef")); // true
        System.out.println(hasAllUnique("hello")); // false
    }
}