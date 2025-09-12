package HashMap;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList Demo (allows duplicates)
        ArrayList<String> fruits = new ArrayList<>();
        System.out.print("Enter number of fruits for ArrayList: ");
        int n1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter " + n1 + " fruits:");
        for (int i = 0; i < n1; i++) {
            fruits.add(scanner.nextLine().trim());
        }
        System.out.println("ArrayList (allows duplicates): " + fruits);

        // HashSet Demo (removes duplicates)
        HashSet<String> uniqueFruits = new HashSet<>();
        System.out.print("\n Enter number of fruits for HashSet: ");
        int n2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter " + n2 + " fruits:");
        for (int i = 0; i < n2; i++) {
            uniqueFruits.add(scanner.nextLine().trim());
        }
        System.out.println("HashSet (no duplicates): " + uniqueFruits);

        // HashMap Demo (fruit name and count)
        HashMap<String, Integer> fruitCounts = new HashMap<>();
        System.out.print("\n Enter number of fruit-count entries for HashMap: ");
        int n3 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter " + n3 + " fruit name and count (separated by space):");
        for (int i = 0; i < n3; i++) {
            String[] input = scanner.nextLine().trim().split("\\s+");
            String fruit = input[0];
            int count = Integer.parseInt(input[1]);
            fruitCounts.put(fruit, count);
        }
        System.out.println("HashMap (fruit -> count): " + fruitCounts);

        // Optionally fetch a count
        System.out.print("\n Enter a fruit to get its count: ");
        String searchFruit = scanner.nextLine().trim();
        System.out.println("Count of " + searchFruit + ": " + fruitCounts.getOrDefault(searchFruit, 0));

        scanner.close();
    }
}