package QAInterviewQuestions;

public class FirstNonRepeating {
    public static void main (String [] args) {
        String Str = "swiss";
        for( int i = 0;  i < Str.length(); i++) {
            if (Str.indexOf(Str.charAt(i))  == Str.lastIndexOf(Str.charAt(i))) {
                System.out.println(" First No Repeating Elements: " + Str.charAt(i));
                break;
            }
        }
    }
}
