package codingquestions;

public class ChangeStringCharacter {

    public static void main(String[] args) {
        String value = "ashish";
        char newChar = 'k';
        StringBuilder stringBuilder = new StringBuilder(value);
        System.out.println(value.charAt(1));
        stringBuilder.setCharAt(1,newChar);
        System.out.println(stringBuilder);
    }
}
