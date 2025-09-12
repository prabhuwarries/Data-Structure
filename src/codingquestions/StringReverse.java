package codingquestions;

public class StringReverse {
    public static void main(String[] args) {
        String name = "ashish";

        StringBuilder stringBuilder = new StringBuilder(name).reverse();
        System.out.println("Reversed String with StringBuilder: "+stringBuilder);

        char[] charArray = name.toCharArray();

        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        String reversedString = new String(charArray);

        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reversedString);
    }
}
