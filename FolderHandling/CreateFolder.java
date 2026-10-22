package FolderHandling;
import java.io.File;
import java.io.IOException;


public class CreateFolder {
    public static void main(String[] args) {
         
        File folder = new File("myFolder");

        if(folder.mkdirs()){
            System.out.println("folder created");
        }else{
            System.out.println("folder already exist");
        }

        
        String[] names = folder.list();

        
        if (names != null) {
            for (String name : names) {
                System.out.println(name);
            }
        }
}
}
