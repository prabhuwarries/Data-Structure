package StringManipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result); // Output: w
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

}
