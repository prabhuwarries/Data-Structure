package ArrayProblems12October;

import java.util.*;

public class FindDuplicates {
    public static void printDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : nums) {
            if (!seen.add(n))
                duplicates.add(n);
        }

        if (duplicates.isEmpty())
            System.out.println("No duplicates found.");
        else
            System.out.println("Duplicates: " + duplicates);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        printDuplicates(arr); // Output: Duplicates: [2, 3]
    }
}
