package JavaProblemsOn3rdOct;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123456789;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number is: " + reversedNum);
    }
}
