package leetCodeQuestions;

public class validPalindrome2 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        validPalindrome2 vp2 = new validPalindrome2();
        System.out.println(vp2.validPalindrome("abca")); // true
        System.out.println(vp2.validPalindrome("abc")); // false
        System.out.println(vp2.validPalindrome("deeee")); // true
    }


}
