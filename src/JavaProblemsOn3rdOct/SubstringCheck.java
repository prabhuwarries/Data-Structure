package JavaProblemsOn3rdOct;

public class SubstringCheck {
    public static void main(String[] args) {
        String mainStr = "Hello, world!";
        String subStr = "world";
        if (mainStr.contains(subStr)) {
            System.out.println("The string '" + mainStr + "' contains the substring '" + subStr + "'.");
        } else {
            System.out.println("The string '" + mainStr + "' does not contain the substring '" + subStr +
                    "'.");
        }
    }
}
