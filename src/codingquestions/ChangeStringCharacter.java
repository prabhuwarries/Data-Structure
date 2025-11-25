package codingquestions;

public class ChangeStringCharacter {

    public static void main(String[] args) {
        String value = "prabhat";
        char newChar = 'k';
        StringBuilder stringBuilder = new StringBuilder(value);
        System.out.println(value.charAt(4));
        stringBuilder.setCharAt(3,newChar);
        System.out.println(stringBuilder);
    }
}
