package QAInterviewQuestions;

public class ReverseInteger {
    public int Solution(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }

            reversed = reversed * 10 + digit;
        }
        return reversed;

    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        int input1 = 123;
        System.out.println("Reversed of " + input1 + " is: " + obj.Solution(input1)); // Output: 321

        int input2 = -123;
        System.out.println("Reversed of " + input2 + " is: " + obj.Solution(input2)); // Output: -321

        int input3 = 120;
        System.out.println("Reversed of " + input3 + " is: " + obj.Solution(input3)); // Output: 21

        int input4 = 0;
        System.out.println("Reversed of " + input4 + " is: " + obj.Solution(input4)); // Output: 0

        int input5 = 1534236469; // This will cause overflow
        System.out.println("Reversed of " + input5 + " is: " + obj.Solution(input5)); // Output: 0
    }
}
