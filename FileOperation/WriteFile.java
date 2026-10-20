package FileOperation;
import java.io.File;
import java.io.IOException;
import  java.io.FileWriter;
public class WriteFile {
    public static void main(String[] args) {

        File f = new File("WriteFile.txt");

        try{
            if(f.createNewFile()){
                System.out.println("File created and file name is : " + f.getName());
            }else{

                System.out.println("file already exist no need to create");
            }
        }catch(IOException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }

        try{
            FileWriter w = new FileWriter("Writefile.txt");
            w.write("Hello this is first line\n");
            w.write("Hello this is second line\n");
            w.close();
            System.out.println("done writing");
        }catch(IOException e){
            System.out.println("Exception occur: " + e);
        }

    }
}
