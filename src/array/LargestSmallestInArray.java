package array;
import java.util.Scanner;

public class LargestSmallestInArray {

        public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {
                /* ---------- Read array size ---------- */
                System.out.print("Enter the number of elements: ");
                int n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Array size must be positive.");
                    return;
                }

                int[] numbers = new int[n];

                /* ---------- Read n integers ---------- */
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();
                }

                /* ---------- Find maximum ---------- */
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }

                /* ---------- Largest Output ---------- */
                System.out.println("Largest number: " + max);


                /* ---------- Find minimum ---------- */
                int min = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }

                /* ---------- Smallest Output ---------- */

                System.out.println("Smallest number: " + min);

            } catch (Exception e) {
                System.out.println("Please enter valid integers. " + e.getMessage());
            }
        }
}
