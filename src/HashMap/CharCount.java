package HashMap;

public class CharCount {
    public int characterCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CharCount cc = new CharCount();
        String input = "Hi Prabhat Ranjan how are you.";
        char characterToCount = 'a';
        int result = cc.characterCount(input, characterToCount);
        System.out.println("The character '" + characterToCount + "' appears " + result + " times in the string \""
                + input + "\".");
    }

}
