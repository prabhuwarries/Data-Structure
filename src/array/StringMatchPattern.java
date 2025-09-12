package array;

import java.util.*;

public class StringMatchPattern {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Read number of input strings
            System.out.print("Enter the number of strings: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            List<String> input = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                input.add(scanner.nextLine());
            }

            // Read pattern
            System.out.print("Enter the pattern to match: ");
            String pattern = scanner.nextLine();

            List<String> result = new ArrayList<>();

            for (String word : input) {
                if (encode(word).equals(encode(pattern))) {
                    result.add(word);
                }
            }

            System.out.println("Matching Strings: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static String encode(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (char c : str.toCharArray()) {
            map.putIfAbsent(c, index++);
            sb.append(map.get(c));
        }

        return sb.toString();
    }
}
