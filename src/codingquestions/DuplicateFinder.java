package codingquestions;

import java.util.List;

public class DuplicateFinder {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new java.util.ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1};
        List<Integer> duplicates = findDuplicates(numbers);
        System.out.println("Duplicate numbers: " + duplicates);
    }

//        public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1};
//        System.out.println("Duplicate numbers:");
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] == numbers[j]) {
//                    System.out.println(numbers[i]);
//                    break; // To avoid printing the same duplicate multiple times
//                }
//            }
//        }
    }
