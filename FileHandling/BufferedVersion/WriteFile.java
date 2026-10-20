package FileHandling.BufferedVersion;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter("WriteFile.txt"));
            w.write("Line 1");
            w.newLine(); // it make the new line; insted of writing \n.
            w.write("Line 2");
            w.close();
        }catch(IOException e){
            System.out.println("Something wend wrong: " + e.getMessage());
        }
    }
}
