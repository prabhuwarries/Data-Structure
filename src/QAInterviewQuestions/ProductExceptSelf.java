/*
    12. Write a program to compute the product of array except self (without using division).
    Assume input: numbs (array of integers). Return an array output where output[i] is the product of all elements of numbs except numbs[i].
 */

package QAInterviewQuestions;
import java.util.Scanner;
public class ProductExceptSelf {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] output = new int[n];
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct;
            leftProduct *= arr[i];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        System.out.println("Product of array except self:");
        for (int val : output) System.out.print(val + " ");
        sc.close();
    }

}
