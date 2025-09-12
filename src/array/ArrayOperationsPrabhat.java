package array;

import java.util.Scanner;

public class ArrayOperationsPrabhat {
    public ArrayOperationsPrabhat() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arraySize = scanner.nextInt();
        if (arraySize <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] array = new int[arraySize];
            System.out.print("How many numbers do you want to add in array: ");
            int inputSize = scanner.nextInt();
            if (inputSize > arraySize) {
                System.out.println("Input size cannot exceed array size (" + arraySize + ").");
            } else if (inputSize < 0) {
                System.out.println("Input size cannot be negative.");
            } else {
                int addNumber;
                for(addNumber = 0; addNumber < inputSize; ++addNumber) {
                    System.out.print("Enter number " + (addNumber + 1) + ": ");
                    array[addNumber] = scanner.nextInt();
                }

                displayArray(array, inputSize);
                System.out.print("Enter the number to insert in array: ");
                addNumber = scanner.nextInt();
                System.out.print("Enter the index to insert at (0 to " + inputSize + "): ");
                int indexNumber = scanner.nextInt();
                if (indexNumber >= 0 && indexNumber <= inputSize) {
                    if (inputSize == arraySize) {
                        System.out.println("Array is full. Cannot insert element.");
                    } else {
                        inputSize = insertElement(array, inputSize, addNumber, indexNumber);
                    }
                } else {
                    System.out.println("Invalid index. Must be between 0 and " + inputSize + ".");
                }

                System.out.print("Enter the index to delete (0 to " + (inputSize - 1) + "): ");
                int deleteIndex = scanner.nextInt();
                if (deleteIndex >= 0 && deleteIndex < inputSize) {
                    inputSize = deleteArray(array, deleteIndex, inputSize);
                } else {
                    System.out.println("Invalid index. Must be between 0 and " + (inputSize - 1) + ".");
                }

                System.out.print("Do you want to reverse the array (Yes: 1, No: 2): ");
                int reverse = scanner.nextInt();
                if (reverse == 1) {
                    reverseArray(array, inputSize);
                    displayArray(array, inputSize);
                }

                System.out.print("Enter the number to search in array: ");
                int searchNumber = scanner.nextInt();
                searchArray(array, searchNumber, inputSize);
                scanner.close();
            }
        }
    }

    private static void reverseArray(int[] array, int size) {
        for(int i = 0; i < size / 2; ++i) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

    }

    private static void displayArray(int[] array, int size) {
        System.out.println("Array is:");
        if (size == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");

            for(int i = 0; i < size; ++i) {
                System.out.print(array[i]);
                if (i < size - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("]");
        }

    }

    private static int insertElement(int[] array, int size, int element, int index) {
        for(int i = size; i > index; --i) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        ++size;
        displayArray(array, size);
        return size;
    }

    private static int deleteArray(int[] array, int index, int size) {
        for(int i = index; i < size - 1; ++i) {
            array[i] = array[i + 1];
        }

        --size;
        displayArray(array, size);
        return size;
    }

    private static void searchArray(int[] array, int number, int size) {
        for(int i = 0; i < size; ++i) {
            if (array[i] == number) {
                System.out.println("Value " + number + " found at index: " + i);
                return;
            }
        }

        System.out.println("Value " + number + " not found in array.");
    }
}
