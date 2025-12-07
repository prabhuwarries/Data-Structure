/*
1. Reverse a String: Write a Java program to reverse a given string.
2. Find the Largest Element in an Array: Find and print the largest element in an array.
3. Check for Palindrome: Determine if a given string is a palindrome (reads the same backward as forward).
4. Factorial Calculation: Write a function to calculate the factorial of a number.
5. Fibonacci Series: Generate the first n numbers in the Fibonacci sequence.
6. Check for Prime Number: Write a program to check if a given number is prime.
7. String Anagrams: Determine if two strings are anagrams of each other.
8. Array Sorting: Implement sorting algorithms like bubble sort, merge sort, or quicksort.
9. Binary Search: Implement a binary search algorithm to find an element in a sorted array.
10. Duplicate Elements in an Array: Find and print duplicate elements in an array.
11. Linked List Reversal: Reverse a singly-linked list.
12. Matrix Operations: Perform matrix operations like addition, multiplication, or transpose.
13. Implement a Stack: Create a stack data structure and implement basic operations (push, pop).
14. Implement a Queue: Create a queue data structure and implement basic operations (enqueue, dequeue).
15. Inheritance and Polymorphism: Implement a class hierarchy with inheritance and demonstrate polymorphism.
16. Exception Handling: Write code that demonstrates the use of try-catch blocks to handle exceptions.
17. File I/O: Read from and write to a file using Java's file I/O capabilities.
18. Multithreading: Create a simple multithreaded program and demonstrate thread synchronization.
19. Lambda Expressions: Use lambda expressions to implement functional interfaces.
20. Recursive Algorithms: Solve a problem using recursion, such as computing the factorial or Fibonacci sequence.
 */

package CodingInterview;
import java.io.*;
import java.util.*;
import java.util.function.*;

public class InterviewQuestions {

    // 15. Inheritance and Polymorphism
    abstract static class Shape {
        abstract double area();
        abstract void display();
    }

    static class Circle extends Shape  {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }

        @Override
        void display() {
            System.out.println("Circle with radius: " + radius + ", Area: " + area());
        }
    }

    static class Rectangle extends Shape {
        private final double length;
        private final double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }

        @Override
        void display() {
            System.out.println("Rectangle " + length + "x" + width + ", Area: " + area());
        }
    }

    // 11. Linked List Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 13. Stack Implementation
    static class Stack {
        private static final int MAX = 100;
        private final int[] arr = new int[MAX];
        private int top = -1;

        void push(int x) {
            if (top >= MAX - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        int pop() {
            if (top < 0) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        int peek() {
            return (top < 0) ? -1 : arr[top];
        }

        boolean isEmpty() {
            return top < 0;
        }
    }

    // 14. Queue Implementation
    static class Queue {
        private final int[] arr;
        private int front;
        private int rear;
        private int size;
        private final int capacity;

        Queue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = size = 0;
            rear = capacity - 1;
        }

        void enqueue(int item) {
            if (size == capacity) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            size++;
        }

        int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int item = arr[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }
    }

    // 18. Multithreading
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class CounterThread extends Thread {
        private final Counter counter;

        CounterThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    // 20. Factorial using Recursion
    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    // 20. Fibonacci using Recursion
    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }


    public static class JavaConcepts {

        // 1. Reverse a String
        public static String reverseString(String str) {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }

        // 2. Find Largest Element in Array
        public static int findLargest(int[] arr) {
            if (arr.length == 0) throw new IllegalArgumentException("Array is empty");
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];
            }
            return max;
        }

        // 3. Check for Palindrome
        public static boolean isPalindrome(String str) {
            str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left++) != str.charAt(right--)) return false;
            }
            return true;
        }

        // 4. Factorial Calculation (Iterative)
        public static long factorial(int n) {
            if (n < 0) throw new IllegalArgumentException("Negative number");
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        // 5. Fibonacci Series
        public static void fibonacci(int n) {
            long a = 0, b = 1;
            System.out.print("Fibonacci Series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }

        // 6. Check for Prime Number
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        }

        // 7. Check for Anagrams
        public static boolean areAnagrams(String str1, String str2) {
            str1 = str1.toLowerCase().replaceAll("\\s", "");
            str2 = str2.toLowerCase().replaceAll("\\s", "");

            if (str1.length() != str2.length()) return false;

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }

        // 8. Bubble Sort
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        // 8. Merge Sort
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        private static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] L = new int[n1];
            int[] R = new int[n2];

            System.arraycopy(arr, left, L, 0, n1);
            System.arraycopy(arr, mid + 1, R, 0, n2);

            int i = 0, j = 0, k = left;

            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k++] = L[i++];
                } else {
                    arr[k++] = R[j++];
                }
            }

            while (i < n1) arr[k++] = L[i++];
            while (j < n2) arr[k++] = R[j++];
        }

        // 9. Binary Search
        public static int binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) return mid;
                if (arr[mid] < target) left = mid + 1;
                else right = mid - 1;
            }

            return -1;
        }

        // 10. Find Duplicates in Array
        public static void findDuplicates(int[] arr) {
            Set<Integer> seen = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();

            for (int num : arr) {
                if (!seen.add(num)) {
                    duplicates.add(num);
                }
            }

            System.out.println("Duplicates: " + duplicates);
        }

        // 11. Reverse Linked List
        public static Node reverseLinkedList(Node head) {
            Node prev = null;
            Node current = head;

            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }

        // 12. Matrix Operations
        public static int[][] addMatrices(int[][] a, int[][] b) {
            int rows = a.length;
            int cols = a[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }

            return result;
        }

        public static int[][] multiplyMatrices(int[][] a, int[][] b) {
            int m = a.length;
            int n = b[0].length;
            int p = b.length;
            int[][] result = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < p; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            return result;
        }

        public static int[][] transposeMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] result = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[j][i] = matrix[i][j];
                }
            }

            return result;
        }

        // 16. Exception Handling Demo
        public static void exceptionHandlingDemo() {
            try {
                int[] arr = new int[5];
                arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("Finally block executed");
            }
        }

        // 17. File I/O Operations
        public static void fileIODemo() {
            String filename = "test.txt";

            // Writing to file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write("Hello, File I/O in Java!");
                writer.newLine();
                writer.write("This is a test file.");
                System.out.println("Data written to file successfully");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

            // Reading from file
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                System.out.println("\nReading from file:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading from file: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            System.out.println("=== Java Programming Concepts Demo ===\n");

            // 1. String Reversal
            System.out.println("1. Reverse String:");
            System.out.println("   Original: Hello World");
            System.out.println("   Reversed: " + reverseString("Hello World"));

            // 2. Largest Element
            System.out.println("\n2. Largest Element:");
            int[] arr = {5, 2, 9, 1, 7, 6};
            System.out.println("   Array: " + Arrays.toString(arr));
            System.out.println("   Largest: " + findLargest(arr));

            // 3. Palindrome Check
            System.out.println("\n3. Palindrome Check:");
            String word = "racecar";
            System.out.println("   '" + word + "' is palindrome: " + isPalindrome(word));

            // 4. Factorial
            System.out.println("\n4. Factorial:");
            int n = 5;
            System.out.println("   " + n + "! = " + factorial(n));

            // 5. Fibonacci
            System.out.println("\n5. Fibonacci Series:");
            System.out.print("   ");
            fibonacci(10);

            // 6. Prime Check
            System.out.println("\n6. Prime Number Check:");
            int num = 17;
            System.out.println("   " + num + " is prime: " + isPrime(num));

            // 7. Anagrams
            System.out.println("\n7. Anagram Check:");
            String s1 = "listen", s2 = "silent";
            System.out.println("   '" + s1 + "' and '" + s2 + "' are anagrams: " + areAnagrams(s1, s2));

            // 8. Sorting
            System.out.println("\n8. Array Sorting:");
            int[] sortArr = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("   Original: " + Arrays.toString(sortArr));
            bubbleSort(sortArr);
            System.out.println("   Bubble Sort: " + Arrays.toString(sortArr));

            // 9. Binary Search
            System.out.println("\n9. Binary Search:");
            int[] searchArr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 67, 78};
            int target = 23;
            System.out.println("   Array: " + Arrays.toString(searchArr));
            System.out.println("   Search for " + target + ": Found at index " + binarySearch(searchArr, target));

            // 10. Find Duplicates
            System.out.println("\n10. Find Duplicates:");
            int[] dupArr = {1, 2, 3, 4, 2, 5, 6, 3, 7};
            System.out.println("    Array: " + Arrays.toString(dupArr));
            System.out.print("    ");
            findDuplicates(dupArr);

            // 11. Reverse Linked List
            System.out.println("\n11. Reverse Linked List:");
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            System.out.print("    Original: 1 -> 2 -> 3 -> 4\n");
            Node reversed = reverseLinkedList(head);
            System.out.print("    Reversed: ");
            while (reversed != null) {
                System.out.print(reversed.data + (reversed.next != null ? " -> " : ""));
                reversed = reversed.next;
            }
            System.out.println();

            // 12. Matrix Operations
            System.out.println("\n12. Matrix Operations:");
            int[][] mat1 = {{1, 2}, {3, 4}};
            int[][] mat2 = {{5, 6}, {7, 8}};
            int[][] sum = addMatrices(mat1, mat2);
            System.out.println("    Matrix Addition Result:");
            for (int[] row : sum) System.out.println("    " + Arrays.toString(row));

            // 13. Stack
            System.out.println("\n13. Stack Operations:");
            Stack stack = new Stack();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("    Pushed: 10, 20, 30");
            System.out.println("    Popped: " + stack.pop());
            System.out.println("    Peek: " + stack.peek());

            // 14. Queue
            System.out.println("\n14. Queue Operations:");
            Queue queue = new Queue(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            System.out.println("    Enqueued: 10, 20, 30");
            System.out.println("    Dequeued: " + queue.dequeue());

            // 15. Inheritance and Polymorphism
            System.out.println("\n15. Inheritance & Polymorphism:");
            Shape circle = new Circle(5.0);
            Shape rectangle = new Rectangle(4.0, 6.0);
            System.out.print("    ");
            circle.display();
            System.out.print("    ");
            rectangle.display();

            // 16. Exception Handling
            System.out.println("\n16. Exception Handling:");
            System.out.print("    ");
            exceptionHandlingDemo();

            // 17. File I/O
            System.out.println("\n17. File I/O:");
            fileIODemo();

            // 18. Multithreading
            System.out.println("\n18. Multithreading:");
            Counter counter = new Counter();
            CounterThread t1 = new CounterThread(counter);
            CounterThread t2 = new CounterThread(counter);
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("    Final count (synchronized): " + counter.getCount());

            // 19. Lambda Expressions
            System.out.println("\n19. Lambda Expressions:");
            lambdaExpressionsDemo();

            // 20. Recursion
            System.out.println("\n20. Recursion:");
            System.out.println("    Factorial of 5 (recursive): " + factorialRecursive(5));
            System.out.print("    Fibonacci 7th term (recursive): " + fibonacciRecursive(7));

            System.out.println("\n\n=== All Concepts Demonstrated ===");
        }

        // 19. Lambda Expressions Demo
        public static void lambdaExpressionsDemo() {
            // Lambda with Runnable
            Runnable r = () -> System.out.println("Lambda with Runnable");
            r.run();

            // Lambda with custom functional interface
            BinaryOperator<Integer> add = (a, b) -> a + b;
            System.out.println("Lambda addition: 5 + 3 = " + add.apply(5, 3));

            // Lambda with list operations
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            numbers.forEach(n -> System.out.print(n + " "));
            System.out.println();

            // Lambda with filter and map
            List<Integer> squared = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .toList();
            System.out.println("Squared even numbers: " + squared);
        }
    }

}
