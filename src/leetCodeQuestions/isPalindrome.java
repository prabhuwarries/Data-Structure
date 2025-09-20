package leetCodeQuestions;

public class isPalindrome {
    public boolean Solution (int x) {
        if (x < 0 ) return false;
        int original = x;
        int reversed = 0;
        while (x !=0) {
            int digit = x % 10;
            reversed =  reversed * 10  + digit;
            x = x /10;
        }
        return  original == reversed;
    }
    public static void main (String[] args) {
        isPalindrome ip = new isPalindrome();
        int x = 121;
        boolean result = ip.Solution(x);
        System.out.print(" Is " +  x + " a palindrome? " + result);
    }
}
