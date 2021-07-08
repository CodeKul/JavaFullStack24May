package filehandling;

import java.io.*;

public class FileReaderWriter {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;
        File file = new File("JavaFile.txt");

        try {
            fileWriter= new FileWriter(file);
            fileWriter.write("Good Morning...!");
            System.out.println("File write successfully...!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileReader = new FileReader(file);
            int i = fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i= fileReader.read();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
