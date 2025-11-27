package CodingInterview;

public class AddBinary {
    public String Solution(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary obj = new AddBinary();
        String a = "1010";
        String b = "1011";
        System.out.println("Sum of binary strings: " + obj.Solution(a, b)); // Output: "10101"
    }

}
