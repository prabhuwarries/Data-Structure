package StringManipulation;

public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.isEmpty())
            return str;

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println("Compressed String: " + compress(input));
        // Output: a2b1c5a3
    }
}