package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        File file = new File("FHDemo.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Wel-Come to India";
            byte[] bt = str.getBytes();
            fileOutputStream.write(bt);

            System.out.println("saved..!");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = fileInputStream.read();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
