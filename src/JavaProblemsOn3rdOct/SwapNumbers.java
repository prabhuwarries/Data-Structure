package JavaProblemsOn3rdOct;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 20, b = 40;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
