package FileHandling;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ReadFileScanner {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(new File("myfile.txt"));
            while (sc.hasNextLine()) {
                String sr = sc.nextLine();
                System.out.println(sr);

            }
            sc.close();
        } catch (FileNotFoundException f) {
            System.out.println("Exception: " + f);
        }
    }
}
