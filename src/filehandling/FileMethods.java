package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {

    public static void main(String[] args) {
        File file = new File("smaple1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.list());
        System.out.println(file.delete());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
