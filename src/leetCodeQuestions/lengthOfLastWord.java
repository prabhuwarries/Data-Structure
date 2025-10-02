package leetCodeQuestions;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        return trimmed.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        lengthOfLastWord solution = new lengthOfLastWord();
        String s = "Hello World";
        int length = solution.lengthOfLastWord(s);
        System.out.println("Length of the last word: " + length); // Output: 5

        String s2 = "   fly me   to   the moon  ";
        int length2 = solution.lengthOfLastWord(s2);
        System.out.println("Length of the last word: " + length2); // Output: 4

        String s3 = "luffy is still joyboy";
        int length3 = solution.lengthOfLastWord(s3);
        System.out.println("Length of the last word: " + length3); // Output: 6
    }

}
