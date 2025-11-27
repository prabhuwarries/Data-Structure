package leetCodeQuestions;

public class plusOne {
    public int[] Solution(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        plusOne obj = new plusOne();
        int[] digits = { 1, 2, 3 };
        int[] result = obj.Solution(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

}
