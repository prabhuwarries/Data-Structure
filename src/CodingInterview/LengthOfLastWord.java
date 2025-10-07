package CodingInterview;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        String s = "Hello World";
        System.out.println("Length of last word: " + obj.lengthOfLastWord(s)); // Output: 5
    }
}
