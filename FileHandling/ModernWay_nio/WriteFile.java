package FileHandling.ModernWay_nio;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

try{
            // Files.writeString(Paths.get("myfile.txt"), "Hello this is modern way to write in file");

            List<String>list = List.of("Line 1", "Line 2", "Line 3");
            Files.write(Paths.get("myfile.txt"), list);
            System.out.println("file writing done ");
}catch(IOException e){
    System.out.println("some thing wend wrong " + e.getMessage());
}

    }
}
