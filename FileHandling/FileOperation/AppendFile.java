package FileHandling.FileOperation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("WriteFile.txt", true);
            f.write("Hello this is append line \n");
            f.close();
            System.out.println("append done");
        } catch (IOException e) {
            System.out.println("Something wend wrong:  " + e.getMessage());
        }

        try {
            FileReader r = new FileReader("WriteFile.txt");
            int ch;
            while ((ch = r.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
            r.close();
        } catch (IOException e) {
            System.out.println("something wend wrong while reading : " + e.getLocalizedMessage());
        }
    }
}
