//2. Write Java code to reverse a string while preserving the whitespace.
package javaInterview;

import java.util.Scanner;

public class ReverseStringPreserveSpace {

    public static String reverseStringPreserveSpace(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            if (charArray[left] == ' ') {
                left++;
            } else if (charArray[right] == ' ') {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse while preserving spaces: ");
        String input = sc.nextLine();
        String reversed = reverseStringPreserveSpace(input);
        System.out.println("Reversed string with preserved spaces: " + reversed);
        sc.close();
    }
}
