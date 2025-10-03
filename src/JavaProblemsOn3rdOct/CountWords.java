package JavaProblemsOn3rdOct;

public class CountWords {
    public static void main(String[] args) {
        String str = "Java is a programming language with expert coading.";
        String[] words = str.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
