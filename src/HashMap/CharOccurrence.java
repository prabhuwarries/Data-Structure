package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurrence {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine().toLowerCase(); // make it case-insensitive

            Map<Character, Integer> freqMap = new HashMap<>();

            for (char ch : input.toCharArray()) {
                if (ch == ' ')
                    continue;

                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            System.out.println("Character occurrences:");
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
            }

            /*
             * Counts how many times each character appears in a user-supplied string.
             * Time Complexity: O(n) where n is the length of the input string.
             * – We make a single pass over the string (n iterations).
             * – Each map operation (get / put) is O(1) on average for HashMap.
             * Space Complexity: O(k) where k is the number of distinct characters.
             */
        }
    }
}
