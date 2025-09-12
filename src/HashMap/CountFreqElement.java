package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreqElement {

    public static Map<String, Integer> countFrequency(String[] array) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : array) {
            // If key exists, increment count; otherwise, set count to 1
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many elements they want to enter
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Create and fill the array
        String[] items = new String[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            items[i] = scanner.nextLine().trim();
        }

        // Count frequency
        Map<String, Integer> frequency = countFrequency(items);

        // Print the results
        System.out.println("Frequency of elements:");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
