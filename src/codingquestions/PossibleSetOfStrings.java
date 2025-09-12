package codingquestions;

public class PossibleSetOfStrings {

    // Print all possible strings of length k that can be formed from a set of n characters  set[] = {'a', 'b'}, k = 3
    // Output:  aaa, aab, aba, abb, baa, bab, bba, bbb,

    public static void main(String[] args) {
        char[] setChars = {'a', 'b'};
        int k = 3;
        printAllPosibleString(setChars, "",  setChars.length, k);

    }
    private static void printAllPosibleString(char[] set, String prefix, int length, int k) {
        if (k == 0) {
            System.out.print(prefix+", ");
            return;
        }

        for (int i = 0; i < length; i++) {
            String newPrefix = prefix + set[i];
            printAllPosibleString(set, newPrefix, length, k - 1);
        }
    }
}
