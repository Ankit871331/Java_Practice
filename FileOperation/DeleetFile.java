package FileOperation;
import java.io.File;
public class DeleetFile {
    public static void main(String[] args) {
        File f = new File("FileCreated.txt");
        if(f.delete()){
            System.out.println("File deleted: ");
        }else{
            System.out.println("File not deleted: because file do not exist");
        }
    }
}
