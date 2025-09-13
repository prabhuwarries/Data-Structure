package CodilityTestSets;
public class MaximizeNumber {
    public int maximizeNumber(int N,  int K ) {
        // Implement your solution here
        char[] digits = String.valueOf(N).toCharArray();

        for (int i = 0; i < digits.length && K > 0; i++) {
            int currentDigit = digits[i] - '0';
            int increment = Math.min(9 - currentDigit , K);
            digits[i] = (char) ('0' + (currentDigit + increment));
            K -= increment;
        }
        return Integer.parseInt(new String(digits));
    }

    public static void main (String[] args) {
        MaximizeNumber sol = new MaximizeNumber ();
        System.out.println("N= 512, K= 10 " + sol.maximizeNumber(512, 10));
        System.out.println("N= 191, K= 4 " + sol.maximizeNumber (191, 4));
        System.out.println("N= 285, K= 20 " + sol.maximizeNumber (285, 20));
        System.out.println("N=999999999, K=9 → " + sol.maximizeNumber(999999999, 9)); // 999999999

    }

}
