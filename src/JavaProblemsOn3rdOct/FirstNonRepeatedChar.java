package JavaProblemsOn3rdOct;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String str = "automation";
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated character is: " + ch);
                break;
            }
        }
    }
}
