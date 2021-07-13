package filehandling;

import java.io.*;

public class BufferReaderWriter {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("newFile.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("Good Day..");
            System.out.println("Saved..");
//            bufferedWriter.close();
//            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("newFile.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            int i ;
            while ((i= bufferedReader.read()) != -1){
                System.out.println((char) i);
//                i = bufferedReader.read();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

    }
}
