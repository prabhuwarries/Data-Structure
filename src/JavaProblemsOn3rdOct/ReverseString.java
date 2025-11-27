package JavaProblemsOn3rdOct;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Automation";
        String ReversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ReversedString += str.charAt(i);
        }
        System.out.println("Reversed string is: " + ReversedString);

    }

}
