package javaInterview;
import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            /* ---------- Read input string ---------- */
            System.out.print("Enter a string: ");
            String str = scanner.nextLine().toLowerCase();

            int vowels = 0, consonants = 0;

            /* ---------- Count vowels & consonants ---------- */
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {        // consider letters only
                    switch (ch) {                    // vowel check
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vowels++;
                            break;
                        default:
                            consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
        }
    }
}
