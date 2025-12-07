package StringManipulation;

public class ReverseString {
    public static String reverse(String str) {
        char[] ch = str.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String input = "Prabhat";
        System.out.println("Reversed String: " + reverse(input)); // Output: tahbarP
    }

}
