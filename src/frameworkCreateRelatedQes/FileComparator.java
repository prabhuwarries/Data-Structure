package frameworkCreateRelatedQes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileComparator {
    public static void main(String[] args ) {

        try(BufferedReader br1  =  new BufferedReader( new FileReader("src/frameworkCreateRelatedQes/file1.txt"));
            BufferedReader br2  =  new BufferedReader( new FileReader("src/frameworkCreateRelatedQes/file2.txt"))) {
            String  line1 , line2;
            int lineNum = 1;
            boolean equal = true;
            while ((line1 =br1.readLine()) != null & (line2 = br2.readLine()) != null) {
                if(!line1.equals(line2)) {
                    System.out.println( "Difference at line " + lineNum + ": ");
                    System.out.println(" File1 " + line1);
                    System.out.println(" File2 " + line2);
                    equal = false;
                }
                lineNum++;
            }
            if ( equal) System.out.println(" Files are Identical. ");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
