package javaInterview;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter second number (b): ");
            int b = scanner.nextInt();

            System.out.println("Before swap: a = " + a + ", b = " + b);

            /* ---- Swap using arithmetic operations (no third variable) ---- */
            a = a + b;  // sum stored in a
            b = a - b;  // original a assigned to b
            a = a - b;  // original b assigned to a
            /* ------------------------------------------------------------- */

//           // ---- Alternative XOR method  ----------------------------------- */
//            a = a ^ b;
//            b = a ^ b;
//            a = a ^ b;
//            // * ------------------------------------------------------------- */

            System.out.println("After  swap: a = " + a + ", b = " + b);
        } catch (Exception e) {
            System.out.println("Please enter valid integers. " + e.getMessage());
        }
    }
}