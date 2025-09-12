package codingquestions;

import java.util.Scanner;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a Number : ");
            int number = scanner.nextInt();
            int[] list = new int[number];

            for (int i = 0; i < number; i++) {
                System.out.print("Enter a " + i + " Number : ");
                list[i] = scanner.nextInt();
            }

            findDuplicateNumber(list, list.length, scanner);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void findDuplicateNumber(int[] list, int length, Scanner scanner) {
        int duplicateNumber = -1;
        int position = 0;
        int index = -1;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (list[i] == list[j]) {
                    duplicateNumber = list[i];
                    position = j + 1;
                    index = j;
                    break;
                }
            }
            if (index != -1) break; // exit outer loop too if found
        }

        if (duplicateNumber == -1) {
            System.out.println("Not Found Duplicate Number");
        } else {
            System.out.println("Found Duplicate Number: " + duplicateNumber);
            System.out.println("Position: " + position);
            System.out.println("Index: " + index + "\n");
        }

        displayArray(list);
        System.out.println();

        if (index != -1) {
            System.out.print("Do you want to remove duplicate number (Yes: 1, No: 2) : ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                deleteArray(list, index, list.length);
            }
        }
    }

    private static void deleteArray(int[] ary, int deleteIndex, int length) {
        for (int i = deleteIndex; i < length - 1; i++) {
            ary[i] = ary[i + 1];
        }

        System.out.println("Array after deleting the duplicate:");
        for (int i = 0; i < length - 1; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println();
    }

    private static void displayArray(int[] ary) {
        for (int value : ary) {
            System.out.print(value + " ");
        }
    }
}
