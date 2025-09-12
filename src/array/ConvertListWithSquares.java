package array;
import java.util.*;

public class ConvertListWithSquares {

         public static void main(String[] args) {

             try (Scanner scanner = new Scanner(System.in)) {
                 System.out.print("Enter number of elements: ");
                 int n = scanner.nextInt();

                 List<Integer> input = new ArrayList<>();
                 for (int i = 0; i < n; i++) {
                     System.out.print("Enter number " + (i + 1) + ": ");
                     input.add(scanner.nextInt());
                 }

                 List<Integer> result = input.stream()
                         .map(x -> x % 2 == 0 ? x * x : x)
                         .toList();

                 System.out.println("Output- Square of Even number: " + result); // e.g., [1, 16, 3, 36, 64]
             } catch (InputMismatchException e) {
                 System.out.println("Please enter valid integers.");
             }
        }
}

