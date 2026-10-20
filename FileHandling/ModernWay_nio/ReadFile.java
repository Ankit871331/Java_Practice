package FileHandling.ModernWay_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            // String content = Files.readString(Paths.get("Myfile.txt"));

            List<String> lines = Files.readAllLines(Paths.get("myfile.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("File Reading done");
        } catch (IOException e) {
            System.out.println("something wend wrong: " + e.getMessage());
        }
    }
}
