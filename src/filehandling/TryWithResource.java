package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        File file = new File("JavaFile.txt");

        try(FileWriter fileWriter= new FileWriter(file)) {
            fileWriter.write("Good Morning...!");
            System.out.println("File write successfully...!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(file)){
            int i = fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i= fileReader.read();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
