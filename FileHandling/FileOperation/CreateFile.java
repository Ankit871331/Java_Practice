package FileHandling.FileOperation;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("FileCreated.txt");
        
        try{
            if(f.createNewFile()){
                System.out.println("File created " + f.getName());
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("Something went wrong "+ e.getMessage());
        }
    }
}
