package JavaProblemsOn3rdOct;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String paindromeString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            paindromeString += str.charAt(i);
        }

        if (str.equals(paindromeString)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

}
