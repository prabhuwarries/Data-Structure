package CodilityTestSets;

public class DigitSum {
    public int solution(int N) {
        int targetSum = digitSummation(N);
        int num = N + 1;
        while ( true) {
            if (digitSummation(num) == targetSum) {
                return num;
            }
            num++;
        }
    }

    private int digitSummation(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main (String[] args) {
        DigitSum sol = new DigitSum ();
        System.out.println("N= 28 → " + sol.solution(28)); // 37
        System.out.println("N= 123 → " + sol.solution (123)); // 132
        System.out.println("N= 999 → " + sol.solution (999)); // 1899

    }
}
