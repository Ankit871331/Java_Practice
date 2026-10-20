package FileOperation;
import java.io.File;
public class CheckFileInfo {
    public static void main(String[] args) {
        File f = new File("WriteFile.txt");
        File f1 = new File("C:\\Users\\anky9\\OneDrive\\Desktop\\java_ducat\\FileOperation");
        System.out.println("File exist true or false "+f.exists());
        System.out.println("Checking 'Writeefile.txt ' is a file or folder: " + f.isFile());
        System.out.println("Checking FileOperation is directry or not " + f1.isDirectory());
        System.out.println("Get the name fo the folder " + f1.getName());
        System.out.println("get the path of the file: " + f.getPath());
        System.out.println("get the complete path of the file: " + f.getAbsolutePath());
        System.out.println("Get the file size in bytes: " + f1.length());
        System.out.println("checking if file readable or not " + f.canRead());
        System.out.println("checking if filder can be read or not: " + f1.canRead());
        System.out.println("checking readable or not: " + f.canWrite());
        System.out.println("checking can we write in the folder or not: " + f1.canWrite());
        System.out.println("get the time and data when it was modified last time: " + f.lastModified());
    }
}
