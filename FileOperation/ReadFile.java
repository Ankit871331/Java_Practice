package FileOperation;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader r = new FileReader("WriteFile.txt");
            int ch;

            while ((ch = r.read()) != -1) {
                System.out.print((char) ch);
            }
            r.close();
        } catch (IOException e) {
            System.out.println("Error occurs: " + e);
        }
    }
}
