package QAInterviewQuestions;

public class ReverseStringWithSpaces {
//    public static void main(String[] args) {
//        String input = "I am a Java Developer";
//        String reversed = reverseStringPreservingSpaces(input);
//        System.out.println("Original: " + input);
//        System.out.println("Reversed: " + reversed);
//    }
//
//    public static String reverseStringPreservingSpaces(String str) {
//        char[] charArray = str.toCharArray();
//        int left = 0;
//        int right = charArray.length - 1;
//
//        while (left < right) {
//            // Move left index to the next non-space character
//            if (charArray[left] == ' ') {
//                left++;
//                continue;
//            }
//            // Move right index to the previous non-space character
//            if (charArray[right] == ' ') {
//                right--;
//                continue;
//            }
//            // Swap characters
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//            left++;
//            right--;
//        }
//        return new String(charArray);
//    }

    // Alternative approach

    public static void main(String [] args) {
        String input = " a bc d " ;
        char[] chars = input.toCharArray();
        char[] result = new char[chars.length];

        for ( int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                result[i] = ' ';
            }
        }
        int  j = chars.length -1 ;
        for (char aChar : chars) {
            if (aChar != ' ') {
                while (result[j] == ' ') {
                    j--;
                }
                result[j] = aChar;
                j--;
            }
        }
        System.out.println( new  String(result));
    }

}
