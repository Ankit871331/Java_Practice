package FileHandling.BufferedVersion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try {
            BufferedReader r = new BufferedReader(new FileReader("Writefile.txt"));
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
            r.close();
        } catch (IOException e) {
            System.out.println("something wend wrong: " + e.getMessage());
        }
    }
}
